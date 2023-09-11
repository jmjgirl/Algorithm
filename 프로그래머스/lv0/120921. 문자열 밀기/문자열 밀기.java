import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String [] arr = A.split("");
        
        List<String> list = new ArrayList<>();
        for (int j=0; j<A.length(); j++) {
            list.add(arr[j]);
        }
        
        // list를 string으로
        System.out.println(String.join("", list));
        
        for(int i=0; i<A.length(); i++) {
            if(B.equals(String.join("", list))) {
                return answer;
            }
            answer++;
            list.add(0,list.get(A.length()-1));
            list.remove(A.length());
        }
        
        if (answer >= A.length()) {
            return -1;
        }
        
        return answer;
    }
}