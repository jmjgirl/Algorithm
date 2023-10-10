import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int count = 0;
        int index = 0;
        
        for(String[] arr : photo) {
            for(int i=0; i<arr.length; i++) {
                if(Arrays.asList(name).contains(arr[i])) // 만약 포함하면
                    answer[index] += yearning[Arrays.asList(name).indexOf(arr[i])];
            }
            index++;
        }
        return answer;
    }
}