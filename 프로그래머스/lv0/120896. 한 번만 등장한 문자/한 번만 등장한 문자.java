class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 알파벳 개수
        int [] alphabet = new int[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i)-'a']++;
        }
        
        for (int j = 0; j < alphabet.length; j++) {
            if (alphabet[j] == 1) {
               answer += Character.toString(j + 'a');
            }
        }
        return answer;
    }
}