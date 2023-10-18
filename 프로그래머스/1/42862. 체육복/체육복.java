import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n];
        Arrays.fill(clothes,1);
        
        // System.out.println(Arrays.toString(clothes));
        // 잃어버린 학생
        for(int i=0; i<lost.length; i++) {
            clothes[lost[i]-1] = 0;
        }
        
        // 두 벌 있는 학생
        for(int i=0; i<reserve.length; i++) {
            if(clothes[reserve[i]-1] != 0) clothes[reserve[i]-1] = 2;
            else if(clothes[reserve[i]-1] == 0) clothes[reserve[i]-1] = 1;
        }
        
        // 나눠주기
        for(int i=0; i<n; i++) {
            if(clothes[i] == 2) {
                if(i >= 1 && clothes[i-1] == 0) {
                    clothes[i] = 1;
                    clothes[i-1] = 1;
                } else if(i+1 < n && clothes[i+1] == 0) {
                    clothes[i] = 1;
                    clothes[i+1] = 1;
                }
            }
        }
        
        for(int i=0; i<clothes.length; i++) {
            if(clothes[i] >= 1) answer++;
        }
        
        return answer;
    }
}