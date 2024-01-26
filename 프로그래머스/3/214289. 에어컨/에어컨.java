/* 
전원 ON
- 실내온도 != 희망온도 -> 1분뒤 실내온도가 1도 상승 or 하강
- 실내온도 == 희망온도 -> 실내온도 변하지 X

전원 OFF
- 실내온도 != 실외온도 -> 희망온도와 같아지는 방향으로 1도 상승 or 하강
- 실내온도 == 실외온도 -> 실내온도 변하지 x

소비전력 최소화 (승객 탑승 중인 실내온도를 t1이상 t2이하 유지)
- 희망온도 != 실내온도 -> 매 분 전력 a만큼 소비
- 희망온도 == 실내온도 -> 매 분 전력 b만큼 소비
- 전원 OFF -> 전력 소비 X
- 전원 끄고 키는데 필요한 시간, 전력 = 0

*/
import java.math.*;
class Solution {
    public int solution(int temperature, int t1, int t2, int a, int b, int[] onboard) {
        int answer = 100 * 1000;
        
        // 인덱스를 맞춰주기 위해 +10 (0 ~ 50)
        temperature += 10;
        t1 += 10;
        t2 += 10;
        
        // DP[i][j] = i분에 j온도를 맞추기위한 최소비용
        int[][] DP = new int[onboard.length][51];
        
        // DP 배열을 전력이 가장 크게 될 수 있게
        int maxV = 100 * 1000; 
        for(int i=0; i<DP.length; i++) {
            for(int j=0; j<DP[0].length; j++) {
                DP[i][j] = maxV;
            }
        }
        
        // 0분에 실내온도일때는 0
        DP[0][temperature] = 0;
        
        // t2보다 온도가 높으면 낮춰야함
        int flag = temperature > t2 ? -1 : 1;
        
        for(int i=1; i<onboard.length; i++) {
            for(int j=0; j<51; j++) {
                int minV = maxV;
                // 승객 탑승중일때 (t1 ~ t2)이거나 승객이 탑승중이지 않으면
                if(onboard[i]==1 && (j >= t1 && j <= t2) || onboard[i]==0) {
                    
                    // 에어컨을 키고 실내온도가 희망온도와 다른 경우
                    if(0 <= j-flag && j-flag <= 50) {
                        minV = Math.min(minV, DP[i-1][j-flag] + a);
                    }
                    
                    // 에어컨을 키고 실내온도가 희망온도와 같은 경우
                    if(t1 <= j && j <= t2) {
                        minV = Math.min(minV, DP[i-1][j] + b);
                    }
                    
                    // 에어컨을 끄고 실내온도가 실외온도와 다른 경우 (전력소비 X)
                    if(0 <= j+flag && j+flag <= 50) {
                        minV = Math.min(minV, DP[i-1][j+flag]);
                    }
                    
                    // 에어컨 끄고 실내온도가 실외온도와 같은 경우 (전력소비 X)
                    if(j == temperature) {
                        minV = Math.min(minV, DP[i-1][j]);
                    }
                    
                    DP[i][j] = minV;
                }
            }
        }
        
        
        for(int i=0; i<51; i++) {
            answer = Math.min(answer, DP[onboard.length-1][i]);
        }
        
        return answer;
    }
}