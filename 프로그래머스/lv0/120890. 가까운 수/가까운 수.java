import java.math.*;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {

        // 1. 정렬되었다는 말이 없으니까 먼저 정렬
        Arrays.sort(array);
        
        int near = Math.abs(n-array[0]);
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            // 가장 가까운 수가 여러개 일 경우 더 작은 수
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