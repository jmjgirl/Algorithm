class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        
        // n/2을 넘어서서 연속된 숫자를 더해봤자 필요가 없음
        for(int i=1; i<=n/2; i++) {
            int num = i;
            while(sum < n) {
                sum += num++;
                if(sum == n) {
                    answer++;
                    break;
                }
            }
            
            sum = 0;
        }
        return answer;
    }
}