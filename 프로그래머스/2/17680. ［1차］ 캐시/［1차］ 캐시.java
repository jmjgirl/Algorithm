import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        if(cacheSize == 0) return 5 * cities.length;
        
        for(int i=0; i<cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if(queue.contains(city)) {
                answer+=1;
                queue.remove(city);
                queue.add(city);
            } else {
                if(queue.size() < cacheSize) {
                    queue.add(city);
                    answer+=5;
                } else {
                    queue.remove();
                    queue.add(city);
                    answer+=5;
                }
            }  
        }
        return answer;
    }
}