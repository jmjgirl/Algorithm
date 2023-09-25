class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr= s.split(" ", -1);
        
        for(String str : arr) {
            char[] charArr = str.toCharArray();
            for(int i=0; i<charArr.length; i++) {
                if(i % 2 == 0) charArr[i] = Character.toUpperCase(charArr[i]);
                else charArr[i] = Character.toLowerCase(charArr[i]);
            }
            
            answer += new String(charArr) + " ";
        }
        
        return answer.substring(0,answer.length()-1);
    }
}