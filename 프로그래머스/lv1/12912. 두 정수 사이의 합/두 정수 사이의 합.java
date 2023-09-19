class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) {
            answer = a;
        } else if (a < b) {
            answer = sumIn(a,b);
        } else {
            answer = sumIn(b,a);
        }
        
        return answer;
    }
    
    static long sumIn(int a, int b) {
        long sum = 0;
        
        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }
}