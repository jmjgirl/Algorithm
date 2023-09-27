import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int[] dict = new int[strings.length]; // 순서 저장
        
        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<strings.length; j++) {
                // i!=j이고 
                if(strings[i].charAt(n) > strings[j].charAt(n)) dict[i] +=1;
                else if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        dict[i]+=1;
                    }
                }
            }
        }   
        
        for(int i=0; i<strings.length; i++) {
            answer[dict[i]] = strings[i];
        }
        return answer;
    }
}