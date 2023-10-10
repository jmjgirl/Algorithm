import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }
        
        /*
        LinkedList<Integer> ll = new LinkedList();
        
        for(int i=0; i<score.length; i++) {
            
            if(ll.size() >= k && ll.get(0) < score[i]) {
                ll.remove(0);
                ll.add(score[i]);
            } else if (ll.size() < k) {
                ll.add(score[i]);
            }
            
            Collections.sort(ll);
            answer[i] = ll.get(0);
        }
        */
        
        return answer;
    }
}