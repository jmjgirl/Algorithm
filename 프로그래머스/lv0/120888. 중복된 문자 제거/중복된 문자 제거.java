import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String [] arr = my_string.split("");
        
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        for(String word : resultArr) {
            answer += word;
        }
        return answer;
    }
}