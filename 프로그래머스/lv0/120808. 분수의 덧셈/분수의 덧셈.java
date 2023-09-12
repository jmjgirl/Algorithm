class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom = denom1 * denom2;
        int numer = numer1 * (denom / denom1) + numer2 * (denom / denom2);
        
        answer[0] = numer / GCD(numer,denom);
        answer[1] = denom / GCD(numer,denom);
        
        return answer;
    }
    
    private int GCD(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}