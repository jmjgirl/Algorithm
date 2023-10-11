import java.math.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        for(int i=3; i<=n; i+=2) {
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