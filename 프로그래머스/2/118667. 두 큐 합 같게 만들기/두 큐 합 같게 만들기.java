import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        int answer = 0;
        long queueSum = 0L;
        long sum = 0L;
        
        // 원소의 합 계산 + queue에 수 저장
        for(int i=0; i<queue1.length; i++) {
            queueSum += queue1[i];
            sum += queue2[i];
            que1.add(queue1[i]);
            que2.add(queue2[i]);
        }
        sum = (sum + queueSum) / 2;
        
        while(queueSum != sum) {
            answer++;
            if(queueSum > sum) {
                queueSum -= que1.peek();
                que2.add(que1.poll());
            } else {
                queueSum += que2.peek();
                que1.add(que2.poll());
            }
            
            if(answer >= queue1.length*4) return -1;
        }
        return answer;
    }
}