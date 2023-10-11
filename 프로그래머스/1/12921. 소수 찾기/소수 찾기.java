import java.math.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i=2; i<=n; i++) {
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            
            if(count==0) answer++;
            count=0;
        }
        return answer;
    }
}