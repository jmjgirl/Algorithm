import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // char -> String : String.valueOf()
        
        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}