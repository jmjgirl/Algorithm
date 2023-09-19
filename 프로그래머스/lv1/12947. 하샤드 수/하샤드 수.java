class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int num = 0;
        String strX = String.valueOf(x);
        for(int i=0; i<strX.length(); i++) {
            num += strX.charAt(i) - '0';
        }
        
        if(x % num != 0) {
            answer = false;
        }
        
        return answer;
    }
}