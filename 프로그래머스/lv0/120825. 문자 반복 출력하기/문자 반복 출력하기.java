class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        /* 첫번째 방법
        for(int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        */
        return answer;
    }
}