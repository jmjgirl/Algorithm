import java.util.*;
import java.math.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for(int i=0; i<str1.length()-1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                String str = String.valueOf(first) + String.valueOf(second);
                map1.put(str, map1.getOrDefault(str,0) + 1);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                String str = String.valueOf(first) + String.valueOf(second);
                map2.put(str, map2.getOrDefault(str,0) + 1);
            }
        }
    
        if(map1.size() == 0 && map2.size() == 0) return 65536;
        
        int union = 0; //합집합
        int intersection = 0; //교집합
        
        Iterator<String> keys1 = map1.keySet().iterator();
            while(keys1.hasNext()) {
                String key = keys1.next();
                if(map2.getOrDefault(key,0) >= 1) {
                    int num = Math.min(map1.get(key), map2.get(key));
                    union -= num;
                    intersection += num;
                }
                union += map1.get(key);
            }
            
            Iterator<String> keys2 = map2.keySet().iterator();
            while(keys2.hasNext()) {
                String key = keys2.next();
                union += map2.get(key);
            }
    

        double n = 0;
        if(union == 0) {
            n = 1;
        } else {
            n = (double) intersection / (double)union;
        }
    
        answer = (int) (n * 65536);
        return answer;
    }
}