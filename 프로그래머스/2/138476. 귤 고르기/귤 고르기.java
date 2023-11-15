import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // map에 개수 저장
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t,0) +1);
        }
        
        // map의 value만 arrayList에 저장
        ArrayList<Integer> value = new ArrayList<>(map.values());
        Collections.sort(value,Collections.reverseOrder());
        
        for(int v : value) {
            if(k > 0) {
                k -= v;
                answer++;
            } else {
                break;
            }
        }
            
        return answer;
    }
}