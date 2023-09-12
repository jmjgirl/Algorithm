class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int temp = 0;
        for(int i=0;i<num;i++){
            temp+=i;
        }
        
        int value = (total-temp)/num;

        for(int i=0;i<num;i++){
            answer[i]=i+value;
        }
        /*
        if (total % num == 0) {
            for (int i=0; i<num/2; i++) {
                answer[i] = (total/num) - (num/2-i);
            }
            answer[num/2] = (total/num);
            for (int j= answer.length/2+1; j<answer.length; j++) {
                answer[j] = answer[j-1] +1;
            }
        } else {
            for (int i=0; i<num/2; i++) {
                answer[i] = (total/num) - (num/2-i-1);
            }

            for (int j= answer.length/2; j<answer.length; j++) {
                answer[j] = answer[j-1] +1;
            }
        }
        */
        
        return answer;
    }
}