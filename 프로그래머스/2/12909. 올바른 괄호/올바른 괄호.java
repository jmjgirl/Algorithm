import java.util.*;

class Solution {
    boolean solution(String s) {
        
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length()-1) == '(') return false;
        
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') st.push("O");
            else if(s.charAt(i) == ')' && st.size() == 0) return false;
            else st.pop();
        }
        
        if(st.size() == 0) return true;
        else return false;

    }
}