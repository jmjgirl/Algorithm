// 피보나치 수열...
class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] arr = new long[n+1];
        
        if(n==1) return 1;
        if(n==2) return 2;
        
        arr[1] = 1L;
        arr[2] = 2L;
        for(int i=3; i<=n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567 ;
        }
        
        return arr[n];
    }
}