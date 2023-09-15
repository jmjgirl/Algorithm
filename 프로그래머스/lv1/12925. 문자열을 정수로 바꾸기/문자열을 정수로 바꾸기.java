class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.contains("-")){
            answer = -1 * Integer.parseInt(s.substring(1));
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}