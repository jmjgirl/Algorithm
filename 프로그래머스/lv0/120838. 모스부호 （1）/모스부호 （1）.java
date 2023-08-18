import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String [] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String [] lt = letter.split(" ");
        for (String l : lt) {
            for (int i = 0; i < mos.length; i++) {
                if (l.equals(mos[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
            
        }
        return answer;
    }
}