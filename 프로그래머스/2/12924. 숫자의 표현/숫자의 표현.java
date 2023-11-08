class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        
        for(int i=1; i<=n/2; i++) {
            int num = i;
            while(sum < n) {
                sum += num;
                num++;
                if(sum == n) answer++;
            }
            
            sum = 0;
        }
        return answer;
    }
}