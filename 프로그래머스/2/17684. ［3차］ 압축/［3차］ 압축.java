import java.util.*;
class Solution {
    public int[] solution(String msg) {
        ArrayList<String> dict = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        // 사전에 등록
        for(int i=0; i<26; i++) {
            dict.add(String.valueOf((char)('A'+i)));
        }

        for(int i=0; i<msg.length(); i++) {
            for(int j=dict.size()-1; j>=0; j--) {
               if(msg.substring(i).startsWith(dict.get(j))) {
                   i += dict.get(j).length()-1;
                   arr.add(j+1);
                   if(i+1 < msg.length()) {
                      dict.add(dict.get(j)+msg.charAt(i+1));
                   }
                   break;
               } 
            }
        }
        
        int[] answer = new int [arr.size()];
        int index = 0;
        for(int a : arr) {
            answer[index++] = a;
        }
        
        return answer;
    }
}