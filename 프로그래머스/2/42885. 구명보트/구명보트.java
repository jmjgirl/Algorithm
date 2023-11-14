import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> dq = new LinkedList<>();
        
        Arrays.sort(people);
        for(int p : people) {
            dq.offer(p);
        }
        
        while(dq.size()!=0) {
            if (dq.peekFirst() + dq.peekLast() <= limit) {
                dq.pollFirst();
                dq.pollLast();
                answer++;
            } else {
                dq.pollLast();
                answer++;
            }
        }
        
        return answer;
    }
}