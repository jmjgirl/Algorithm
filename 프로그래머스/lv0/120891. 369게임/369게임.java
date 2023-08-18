class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 케이스가 몇개 오류났는데 숫자가 0일 경우도 생각해야 하는 구나...
        
        while (order > 0) {
            if ((order % 10) % 3 == 0 && order % 10 != 0) {
                answer += 1;
            }
            order = order / 10;
        }
        return answer;
    }
}