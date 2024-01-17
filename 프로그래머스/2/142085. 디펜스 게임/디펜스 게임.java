import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
    
        // 무적권이 enemy의 길이보다 많으면 enemy.length 반환
        if(k >= enemy.length) return enemy.length;
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<enemy.length; i++) {
            if(n < enemy[i] && k <= 0) break;

            queue.add(enemy[i]);
            if(n < enemy[i]) { 
                n += queue.poll();
                k--;
            }
            n -= enemy[i];
            answer++;
        }
        
        return answer;
    }
}