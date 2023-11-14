import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        int fail = 0;

        for(int i=1; i<words.length; i++) {
            int last = words[i-1].length()-1;
            
            if(words[i-1].charAt(last) != words[i].charAt(0)) {
                fail = i+1;
                break;
            }

            if(list.contains(words[i])) {
                fail = i+1;
                break;
            }
            
            list.add(words[i]);
        }


        if(fail > 0) {
            answer[0] = fail % n == 0 ? n : fail % n;
            answer[1] = fail % n == 0 ? fail / n : fail / n + 1;
        }
        return answer;
    }
}