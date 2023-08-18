import java.util.*; 

class Solution {
    public String solution(String my_string) {
        
        char[] str = my_string.toLowerCase().toCharArray();

        Arrays.sort(str);

        String answer = new String(str);
        
        /*
        String answer = "";
        my_string = my_string.toLowerCase();
        
        // String -> 배열
        String [] arr = my_string.split("");
        Arrays.sort(arr);
        
        for(String num : arr){
            answer += num;
        }
        */
        return answer;
    }
}