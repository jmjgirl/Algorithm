import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] countDay = new int[100];
        int[] progressesDay = new int[progresses.length];
        for(int i=0; i<progresses.length; i++) {
            int num = (100 - progresses[i]) / speeds[i];
            int day = (100 - progresses[i]) % speeds[i] == 0 ? num : num + 1; 
            progressesDay[i] = day;
            if(i >= 1 && day < progressesDay[i-1]) {
                progressesDay[i] = progressesDay[i-1];
            }
        }
        
        for(int i=0; i<progressesDay.length; i++) {
            countDay[progressesDay[i]]++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<countDay.length; i++) {
            if(countDay[i] > 0) list.add(countDay[i]);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}