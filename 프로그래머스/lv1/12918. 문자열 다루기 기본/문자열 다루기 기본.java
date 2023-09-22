class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) answer = true;
        else return false;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') answer = true;
            else return false;
        }
        
        return answer;
    }
}