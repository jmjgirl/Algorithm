class Solution {
    public int solution(String my_string) {
        
        String [] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i-1].equals("+")) {
                answer += Integer.parseInt(arr[i]);
            } else if (arr[i-1].equals("-")) {
                answer -= Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}