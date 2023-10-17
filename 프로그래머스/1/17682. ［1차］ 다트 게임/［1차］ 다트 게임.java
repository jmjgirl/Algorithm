import java.math.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] cal = new int[3];
        String numstr = "";
        int num ,index = 0;
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // 숫자일때
            if(c>='0' && c<='9'){       
                numstr += String.valueOf(c); 
            // 문자일때
            } else if(c=='S'||c=='D'||c=='T') {
                num = Integer.parseInt(numstr);
                
                if(c == 'S') {
                    cal[index++] = (int) Math.pow(num,1);
                } else if(c == 'D') {
                    cal[index++] = (int) Math.pow(num,2);
                } else {
                    cal[index++] = (int) Math.pow(num,3);
                }
                numstr = "";
            // 특수 문자일때 
            } else {
                if(c == '*') {
                    cal[index-1] *= 2;
                    if(index-2>=0) cal[index-2] *= 2;
                } else if(c == '#') {
                    cal[index-1] *= -1;
                }
            }
        }
            
          
        for(int i=0; i<cal.length; i++) {
            answer += cal[i];
        }
        
        return answer;
    }
}