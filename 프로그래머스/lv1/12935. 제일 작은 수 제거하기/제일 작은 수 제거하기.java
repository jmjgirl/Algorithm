import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length == 1) return new int[] {-1};
        
        int min = arr[0];
        // 최소값 구하기
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int index = 0;
        for(int j=0; j<arr.length; j++) {
            if(arr[j] != min) answer[index++] = arr[j];
        }
        return answer;
    }
}