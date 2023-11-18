import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        Long range = right - left + 1L;
        int[] answer = new int[range.intValue()];
        
        int index = 0;
        
        for(long i=left; i<=right; i++) {
                answer[index++] = i/n >= i%n ? (int)(i/n+1) : (int)(i%n+1);
        }
        
        return answer;
    }
}