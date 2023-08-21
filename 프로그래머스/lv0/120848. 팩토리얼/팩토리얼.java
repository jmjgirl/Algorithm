class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int multiple = 1;
        for (int i = 1; i <= n; i++) {
            multiple *= i;
            if (multiple == n) {
                answer = i;
                break;
            } else if (multiple > n) {
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}