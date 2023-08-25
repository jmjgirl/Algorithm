class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double [score.length];
        int[] rank = new int [score.length];
        // 평균 점수 계산 (소수점도 생각)
        for (int i = 0; i < score.length; i++) {
            answer[i] = (score[i][0] + score[i][1]) / 2.0;
            rank[i] = 1;
        }
        
        for (double num : answer) {
            for (int j = 0; j < answer.length; j++) {
                if (num > answer[j]) {
                    rank[j]++;
                }
            }
        }
        return rank;
    }
}