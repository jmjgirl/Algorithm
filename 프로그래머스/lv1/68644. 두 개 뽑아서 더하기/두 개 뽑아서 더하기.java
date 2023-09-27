import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                set.add(sum);
            }
        }
    
        int[] answer = new int[set.size()];
        int index = 0;
        for(Integer n : set) {
            answer[index++] = n;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}