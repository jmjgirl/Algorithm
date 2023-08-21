import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        
        int[] fast = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(fast);
        
        int order = emergency.length;
        for (int num : fast) {
            for (int i = 0; i < emergency.length; i++) {
                if (num == emergency[i]) {
                    answer[i] = order--;
                }
            }
        }
        
        return answer;
    }
}