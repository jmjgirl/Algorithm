import java.math.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int [] paint = new int[n+1];
        // 구역 표시
        for(int i=0; i<section.length; i++) {
            paint[section[i]] = 1;
        }
        
        
        for(int i=1; i<paint.length; i++) {
            if(paint[i] == 1) {
                answer++;
                for(int j=0; j<m; j++) {
                    if(i+j < paint.length) {
                       paint[i+j] = 0; 
                    }
                }
            }
        }
        
        return answer;
    }
}