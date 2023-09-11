class Solution {
    public int solution(int a, int b) {

        int B = b / GCD(a,b);
        while (B != 1) {
            if (B % 2 == 0){
                B = B / 2;
            } else if (B % 5 == 0) {
                B = B / 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    // 유클리드 호제법! 두 수의 최대 공약수 구하기
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}