class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        // 10진수 -> 2진수 : Integer.toBinaryString()
        // 2진수 -> 10진수 : Integer.parseInt(String s, int n진수)
        answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
        return answer;
    }
}