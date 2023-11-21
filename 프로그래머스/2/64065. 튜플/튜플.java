import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("\\{|,|}"); 
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(String a : arr) {
            if(a.length() > 0) {
                int num = Integer.parseInt(a);
                if(num > max) max = num;
                map.put(num, map.getOrDefault(num,0) + 1);
            }
        }
        
        int[] answer = new int[map.size()];
        Iterator<Integer> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            Integer key = keys.next();
            answer[map.size() - map.get(key)] = key;
        }
        
        return answer;
    }
}