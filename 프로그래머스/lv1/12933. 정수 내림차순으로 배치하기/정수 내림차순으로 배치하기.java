import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        
        String strn = new StringBuffer(new String(arr)).reverse().toString();
        answer = Long.parseLong(strn);
        
        return answer;
    }
}