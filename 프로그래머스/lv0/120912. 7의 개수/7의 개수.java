class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}