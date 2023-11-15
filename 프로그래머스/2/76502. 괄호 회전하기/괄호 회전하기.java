import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        for(int i=0; i<s.length(); i++) {
            Stack<String> stack = new Stack<>();
            
            for(int j=i; j<i+s.length(); j++) {
                if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}') {
                    answer++;
                    break;
                }
                
                int index = j % s.length();
                if(s.charAt(index)=='[' || s.charAt(index) == '(' || s.charAt(index) == '{') {
                    stack.push(String.valueOf(s.charAt(index)));
                } else if(stack.size() > 0) {
                    if(s.charAt(index) == ']' && stack.peek().equals("[")) stack.pop();
                    else if(s.charAt(index) == '}' && stack.peek().equals("{")) stack.pop();
                    else if(s.charAt(index) == ')' && stack.peek().equals("(")) stack.pop();
                    else {
                        stack.push(String.valueOf(s.charAt(index)));
                    }
                }  
            }
            if(stack.size() > 0) answer++;
            
        }
        
        answer = s.length() - answer;
        return answer;
    }
}