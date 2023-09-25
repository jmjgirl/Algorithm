import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                queue.add(arr[i]);
            }
        }
        
        int[] answer = new int[queue.size()];
        
        for(int j=0; j<answer.length; j++){
            answer[j] = queue.poll();
        }
        
        return answer;
    }
}