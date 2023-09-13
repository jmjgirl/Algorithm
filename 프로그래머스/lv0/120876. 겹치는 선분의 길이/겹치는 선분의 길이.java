class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        // -100 ~ 100
        int[] rail = new int[200];
        
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        for (int value : rail) {
            if (value > 1) answer++;
        }
        
        return answer;
    }
}