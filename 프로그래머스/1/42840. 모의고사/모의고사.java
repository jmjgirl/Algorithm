import java.math.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == num1[i%5]) score[0]++;
            if(answers[i] == num2[i%8]) score[1]++;
            if(answers[i] == num3[i%10]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        /*
        int max = score[0];
        for(int i=1; i<3; i++) {
            if(max < score[i]) max = score[i];
        }
        */
        
        int count = 0;
        for(int i=0; i<3; i++) {
            if(score[i] == max) count++;
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i=0; i<3; i++) {
            if(score[i] == max) answer[index++] = i+1;
        }
        
        return answer;
    }
}