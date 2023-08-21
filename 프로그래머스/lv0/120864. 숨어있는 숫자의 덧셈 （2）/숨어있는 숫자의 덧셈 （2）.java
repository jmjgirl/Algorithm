class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] str = my_string.split("[a-zA-Z]");

        for (String s : str) {
            // [0-9]+ : 0-9까지 최소 한번 이상 반복
            if (s.matches("[0-9]+")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}