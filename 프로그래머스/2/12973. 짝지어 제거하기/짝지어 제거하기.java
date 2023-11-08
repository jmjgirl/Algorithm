import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] str = s.split("");
        stack.push(str[0]);
        for(int i=1; i<str.length; i++) {
            if(!stack.empty() && stack.peek().equals(str[i])) stack.pop();
            else stack.push(str[i]);
        }
        
        if(stack.empty()) return 1;
        else return 0;
        
    }
}