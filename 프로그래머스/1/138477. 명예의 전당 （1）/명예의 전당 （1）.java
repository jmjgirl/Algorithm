import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
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
        
        /*
        LinkedList<Integer> ll = new LinkedList();
        int min = score[0];
        ll.add(score[0]);
        
        for(int i=0; i<score.length; i++) {
            if(ll.size() >= 1 && ll.size() < k) {
                for(int j=0; j<ll.size(); j++) {
                    if(score[i] < ll.get(j)) ll.add(j,score[i]);
                    min = ll.get(0);
                    System.out.println(0);
                    break;
                }
     
           } else if (ll.size()==k) {
              ll.remove(0);
              for(int j=0; j<ll.size(); j++) {
                    if(score[i] < ll.get(j)) ll.add(j,score[i]);
                    min = ll.get(0);
                  System.out.println(1);
                    break;
              }    
            }    
            answer[i] = min;
        }*/
        return answer;
    }
}