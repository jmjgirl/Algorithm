import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // Arraylist로하고 싶은데... 여기서 정렬해서 두개만 곱하면...
        int[] sort = new int[numbers.length];
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}