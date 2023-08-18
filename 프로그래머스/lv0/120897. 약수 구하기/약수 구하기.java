import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        
        //return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
        

        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count ++;
            }
        }
        
        int[] answer = new int[count];
        int num = 0;
            
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[num] = i;
                num++;
            }
        }
        
        return answer;
    
    }
}