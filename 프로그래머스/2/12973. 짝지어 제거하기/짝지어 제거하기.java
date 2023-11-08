import java.util.*;

class Solution
{
    public int solution(String s)
    {
        // String 배열을 Char 배열로
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        stack.push(arr[0]);
        
        for(int i=1; i<arr.length; i++) {
            if(!stack.empty() && stack.peek().equals(arr[i])) stack.pop();
            else stack.push(arr[i]);
            
            if(stack.size() > arr.length-i-1) return 0;
        }
        
        return stack.empty() ?  1 :  0;

        
    }
}