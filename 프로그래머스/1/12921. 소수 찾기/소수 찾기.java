import java.math.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] number = new boolean[n+1];
        // 소수가 아니면 true
        
        for(int i=2; i <= n; i++) {
            if(number[i] != true) {
                for(int j=i*2; j<= n; j+=i) {
                    number[j] = true;
                }
            }
        }
        
        for(int i=2; i<=n; i++) {
            if(number[i] == false) answer++;
        }
        return answer;
    }
}