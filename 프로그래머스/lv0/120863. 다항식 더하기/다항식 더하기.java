import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0; // ~x값
        int n = 0; // 정수
        
        String [] arr = polynomial.split(" ");
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains("x")) {
                x += arr[i].equals("x") ? 1 : Integer.parseInt(arr[i].replace("x",""));
            } else if(!arr[i].equals("+")) {
                n += Integer.parseInt(arr[i]);
            }
        }
        
        if (x==1 && n>=1) {
            answer = "x + " + n;
        } else if (x>=1 && n>=1) {
            answer = x==1 ? "x + " + n : x + "x + " + n;
        } else if (x==0 && n>=1) {
            answer = "" + n;
        } else if (x>=1 && n==0) {
            answer = x==1 ? "x" : x + "x";
        } 

        return answer;
    }
}