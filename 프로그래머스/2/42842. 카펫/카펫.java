import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i=1; i<=yellow; i++) {
            if(yellow % i == 0) {
                y = i+2;
                x = (yellow/i) + 2;
            }
            
            if(x*y == brown + yellow) {
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }
        
        
        return answer;
    }
}