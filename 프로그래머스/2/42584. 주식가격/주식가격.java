import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int price : prices) {
            queue.add(price);
        }
        
        int index = 0;
        int count = 0;
        while(queue.size()!=0) {
            for(int i=index; i<prices.length; i++) {
                if(queue.peek() > prices[i]) {
                    answer[index] = i-count; 
                    queue.poll();
                    break;
                }  
            }
            
            if(answer[index] == 0) {
                answer[index] = queue.size()-1;
                queue.poll();
            }
            count++;
            index++;    
        }
        
        return answer;
    }
}