class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String [] arr = rsp.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("2")) {
                answer += "0";
            } else if (arr[i].equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        } 
        /*
        for (int i = 0; i < rsp.length(); i++ ) {
            if (rsp.charAt(i) == '2') {
                answer += "0";
            } else if (rsp.charAt(i) == '0') {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        */
        return answer;
    }
}