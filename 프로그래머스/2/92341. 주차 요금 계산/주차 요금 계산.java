import java.math.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] minutes = new int[10000]; // 누적 주차 시간
        boolean[] inout = new boolean[10000]; // IN = true, OUT = false
        
        for(String record : records) {
            String[] arr = record.split(" ");
            String[] time = arr[0].split(":");
            
            int carNumber = Integer.parseInt(arr[1]);
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            if(arr[2].equals("IN")) {
                minutes[carNumber] += (hour * 60 + minute) * -1;
                inout[carNumber] = true;
            } else {
                minutes[carNumber] += hour * 60 + minute;
                inout[carNumber] = false;
            }   
        }
        
        int count = 0;
        for(int i=0; i<minutes.length; i++) {
            if(inout[i] == true) {
                minutes[i] += 23 * 60 + 59;
            }
            
            if(minutes[i] > 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i=0; i<minutes.length; i++) {
            if(minutes[i] > 0) {
                if (minutes[i] < fees[0]) answer[index++] = fees[1];
                else answer[index++] = fees[1] + (int) Math.ceil((double)(minutes[i]-fees[0]) / fees[2]) * fees[3];
            }
        }
           
        return answer;
    }
}