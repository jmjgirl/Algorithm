// 문제를 풀어 알고력, 코딩력을 높인다 (같은 문제 여러 번 가능)
// 모든 문제를 풀 수 있는 알고력과 코딩력을 얻는 최단 시간!
import java.math.*;
class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        int alp_target = 0;
        int cop_target = 0;
        
        // 문제의 가장 높은 alp_req와 cop_req를 각각 알고력과 코딩력으로 가짐
        for(int[] problem : problems) {
            alp_target = Math.max(alp_target, problem[0]);
            cop_target = Math.max(cop_target, problem[1]);
        }
        
        // 초기 알고력과 코딩력이 둘 다 목표치보다 높은 경우 -> 최단시간 0
        if(alp >= alp_target && cop >= cop_target) return 0;
        
        // 초기 알고력이 목표치보다 높은 경우 
        if(alp >= alp_target) alp = alp_target;
        
        // 초기 코딩력이 목표치보다 높은 경우
        if(cop >= cop_target) cop = cop_target;
        
        
        // dp 배열 생성 (정수 최대값으로)
        int[][]dp = new int[alp_target+2][cop_target+2];
        for(int i=alp; i<=alp_target; i++) {
            for(int j=cop; j<=cop_target; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        // dp 
        dp[alp][cop] = 0; //시작점
        for(int i=alp; i<=alp_target; i++) {
            for(int j=cop; j<=cop_target; j++) {
                
                // 공부하기
                dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + 1);
                dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + 1);
                
                for(int p=0; p<problems.length; p++) {
                    // 현재 알고력과 코딩력이 문제를 해결할 수 있는 경우
                    if(i>=problems[p][0] && j>=problems[p][1]) {
                        
                        // 문제를 풀었을때 둘 다 목표치가 넘는 경우
                        if(i+problems[p][2]>alp_target && j+problems[p][3]>cop_target) {
                            dp[alp_target][cop_target] = Math.min(dp[alp_target][cop_target], dp[i][j] + problems[p][4]);                        
                        } // 알고력이 목표치를 넘는 경우
                        else if(i+problems[p][2]>alp_target) {
                            dp[alp_target][j+problems[p][3]] = Math.min(dp[alp_target][j+problems[p][3]], dp[i][j] + problems[p][4]);
                        } // 코딩력이 목표치를 넘는 경우
                        else if(j+problems[p][3]>cop_target) {
                            dp[i+problems[p][2]][cop_target] = Math.min(dp[i+problems[p][2]][cop_target], dp[i][j] + problems[p][4]);
                        } // 둘다 목표치를 넘지 않는 경우 (일반)
                        else {
                            dp[i+problems[p][2]][j+problems[p][3]] = Math.min(dp[i+problems[p][2]][j+problems[p][3]], dp[i][j] + problems[p][4]);
                        }
                    }
                } 
            }
        }
        
        answer = dp[alp_target][cop_target];
        return answer;
    }
}