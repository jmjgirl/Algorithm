import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        int[] copyElements = new int[elements.length*2];
        for(int i=0; i<elements.length; i++) {
            copyElements[i] = elements[i];
            copyElements[i+elements.length] = elements[i];
        }
        
        
        for(int i=0; i<elements.length; i++) {
            int sum = 0;
            for(int j=i; j<i+elements.length; j++) {
                sum += copyElements[j];
                set.add(sum);
            }
        }
        
        answer = set.size();
        return answer;
    }
}