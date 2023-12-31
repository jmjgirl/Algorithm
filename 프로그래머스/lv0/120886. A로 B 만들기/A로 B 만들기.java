import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char [] b = before.toCharArray();
        char [] a = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
        /*
        StringBuffer afterBuffer = new StringBuffer(after);
        
        for (int i = 0; i < before.length(); i++) {
            if(afterBuffer.indexOf(String.valueOf(before.charAt(i))) >= 0) {
                afterBuffer.deleteCharAt(afterBuffer.indexOf(String.valueOf(before.charAt(i))));
            }
        }
        
        if (afterBuffer.length() >=1) {
            answer = 0;
        } else {
            answer = 1;
        }
    
        return answer;
        */
    }
}