import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> num = new HashSet();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                num.add(sum);
            }
        }
    
        int[] answer = new int[num.size()];
        
        int index = 0;
        for(Integer n : num) {
            answer[index++] = n;
        }
        
        Arrays.sort(answer);
        /*
        int[] num = new int[101];
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                num[sum] = 1;
            }
        }
        
        int count = 0;
        for(int i=0; i<num.length; i++) {
            if(num[i] == 1) count++;
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i=0; i<num.length; i++) {
            if(num[i] == 1) answer[index++] = i;
        }
        */
        
        return answer;
    }
}