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
            
        /*
        int[] box = new int[10000000]; // 개수 셀 배열
        
        for(int i=0; i<tangerine.length; i++) {
            box[tangerine[i]]++;
        }
        
        Arrays.sort(box);
        for(int i=box.length-1; i>=0; i--) {
            if(k>0) {
                k-=box[i];
                answer++;
            } else {
                break;
            }
        }
        */
        return answer;
    }
}