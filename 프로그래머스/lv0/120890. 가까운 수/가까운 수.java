import java.math.*;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {

        Arrays.sort(array);
        int near = Math.abs(n-array[0]);
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (near == Math.abs(n-array[i])) {
                answer = array[i-1];
            } else if (near >= Math.abs(n-array[i])) {
                near = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        
        return answer;
    }
}