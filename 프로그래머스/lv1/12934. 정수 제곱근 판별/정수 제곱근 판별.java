import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 정수이면
        if (Math.sqrt(n) % 1 == 0.0) {
            answer = (long)(Math.sqrt(n) + 1) * (long) (Math.sqrt(n) + 1);
        } else {
            answer = -1;
        }

        return answer;
    }
}