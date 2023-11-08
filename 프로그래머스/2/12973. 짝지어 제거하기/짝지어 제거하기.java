import java.util.*;

class Solution
{
    public int solution(String s)
    {
        // String 배열을 Char 배열로
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
            } else {
                if(st.peek() == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
    
        return st.empty() ?  1 :  0;

        
    }
}