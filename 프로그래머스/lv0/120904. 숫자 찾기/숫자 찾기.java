class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String [] number = String.valueOf(num).split("");
        
        for(int i = 0; i < number.length; i++) {
            if(number[i].equals(String.valueOf(k))) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}