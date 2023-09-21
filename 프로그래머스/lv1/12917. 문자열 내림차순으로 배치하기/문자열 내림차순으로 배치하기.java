import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] alphabet = s.toCharArray();
        Arrays.sort(alphabet);
        answer = new StringBuffer(new String(alphabet)).reverse().toString();
        
        return answer;
    }
}