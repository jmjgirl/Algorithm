class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num = 0;
        int count = 0;
        while(!s.equals("1")) {
            count++;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') num++;
            }
            s = s.replace("0","");
            int length = s.length();
            s = Integer.toBinaryString(length);
        }
        
        answer[0] = count;
        answer[1] = num;
        return answer;
    }
}