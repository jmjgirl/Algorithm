class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] cal = s.split(" ");
        
        for (int i = cal.length-1; i >= 0; i--) {
            if (cal[i].equals("Z")) {
                cal[i-1] = "0";
            } else {
                answer += Integer.parseInt(cal[i]);
            }
        }
        return answer;
    }
}