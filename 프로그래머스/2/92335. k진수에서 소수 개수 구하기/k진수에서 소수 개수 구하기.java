import java.util.*;
import java.math.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n,k);
        String[] arr = str.split("0+");
        
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            Long num = Long.parseLong(arr[i]);
            for(int j=2; j<=(int)Math.sqrt(num); j++) {
                if(num % j == 0) {
                    count++;
                    break;
                }
            }
            if(num >=2 && count == 0) answer++;
        }
        
        return answer;
    }
}