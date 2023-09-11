class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i < quiz.length; i++) {
            
            String [] arr = quiz[i].split(" ");
            
            
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            
            if (arr[1].equals("-")) {
                if ((num1 - num2) == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            if (arr[1].equals("+")) {
                if ((num1 + num2) == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}