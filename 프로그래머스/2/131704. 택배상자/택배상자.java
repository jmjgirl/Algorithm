import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index=0;
        Stack<Integer> stack = new Stack<>(); // 보조 컨테이너
        
        for(int i=1; i<= order.length; i++) {
            
            if(i != order[index]) {
                stack.add(i);
                continue;
            } 
            
            answer++;
            index++;
            
            while(stack.size() !=0 && stack.peek() == order[index]) {
                stack.pop();
                answer++;
                index++;
            }
            
        }
        return answer;
    }
}