class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char[] phnum = phone_number.toCharArray();
        for(int i=0; i<phnum.length-4; i++) {
            phnum[i] = '*';
        }
        
        answer = new String(phnum);
        
        return answer;
    }
}