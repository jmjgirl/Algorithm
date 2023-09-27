class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            
            if(alphabet[s.charAt(i)-97] == 0) answer[i] = -1;
            else answer[i] = (i+1) - alphabet[s.charAt(i)-97];
            
            alphabet[s.charAt(i)-97] = i+1;
        }
        return answer;
    }
}