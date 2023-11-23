import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<t*m; i++) {
            String s = Integer.toString(i,n);
            for(int j=0; j<s.length(); j++) {
                list.add(String.valueOf(s.charAt(j)));
            }
        }
        
        int size = 0;
        for(int i=p-1; i<list.size(); i+=m) {
            answer += list.get(i);
            size++;
            if(size == t) break;
        }
        
        answer = answer.toUpperCase();
        return answer;
    }
}