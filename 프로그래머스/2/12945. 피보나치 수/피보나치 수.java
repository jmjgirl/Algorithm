class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i=3; i<=n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        return arr[n];
    }

    public int pibonachi(int n) {
        if(n <= 2) return 1;
        else return pibonachi(n-1)%1234567 + pibonachi(n-2)%1234567;
    }
}