import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        
        /*
        String [] cal = s.split(" ");
        
        for (int i = cal.length-1; i >= 0; i--) {
            if (cal[i].equals("Z")) {
                cal[i-1] = "0";
            } else {
                answer += Integer.parseInt(cal[i]);
            }
        }
        */
        
        return answer;
    }
}