import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0) + 1);
        }
        
        Set set = map.entrySet();
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getValue());
            answer *= (int)e.getValue()+1;
        }
        
        answer -= 1;
        return answer;
    }
}