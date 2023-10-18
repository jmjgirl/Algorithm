class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) max++;
            for(int num : win_nums) {
                if(lottos[i] == num) {
                    min++;
                    max++;
                }
            }
        }
        
        answer[0] = max <= 1 ? 6 : 7 - max;
        answer[1] = min <= 1 ? 6 : 7 - min;
        
        return answer;
    }
}