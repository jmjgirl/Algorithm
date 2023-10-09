class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 빈병 2개 -> 콜라 1병
        // 20개를 가져다 주면 ?
        
        // 20개를 가져가서 10개 -> 10개 마시고 다시 가져가서 5개 -> 5개 다 마시고 4개 가져가서 2개 ->
        // 2개 다마시고 가져가서 1개 -> 아까남은 1개랑 받은 1개 가져가서 1개 
        // 10 + 5 + 2 + 1 + 1 = 19
        
        /*
        먼저 n = n - a * (n/a) + (n/a)*b;
        5 - 2*(2) + (2)*1 = 3개
        3 - 2*1 + (1)1 = 2개
        */
        
        while(n>=a) {
            answer += b*(n/a);
            n = n - a*(n/a) + b*(n/a);
            //answer += b*(n/a);
            System.out.println(answer);
        }
        return answer;
    }
}