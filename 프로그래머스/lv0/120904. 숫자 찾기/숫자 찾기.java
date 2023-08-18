class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String number = String.valueOf(num);
        
        answer = number.indexOf(String.valueOf(k));
        if(answer >= 0) {
                return answer + 1;
            } else {
                return -1;
            }
        }
}