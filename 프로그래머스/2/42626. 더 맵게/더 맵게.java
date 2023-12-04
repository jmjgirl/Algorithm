import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int s : scoville) {
            queue.add(s);
        }

        while(true) {
            if(queue.peek() >= K) return answer;
            else if(queue.peek() < K && queue.size() > 1) {
                queue.add(queue.poll() + (queue.poll() * 2));
                answer++;
            } else {
                return -1;
            }
        }
    }
}