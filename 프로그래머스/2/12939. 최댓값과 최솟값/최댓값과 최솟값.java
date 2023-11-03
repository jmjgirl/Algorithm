import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] istr = new int[str.length];
        
        for(int i=0; i<str.length; i++) {
            istr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(istr);
        answer += istr[0] + " " + istr[istr.length-1];
        
        return answer;
    }
}