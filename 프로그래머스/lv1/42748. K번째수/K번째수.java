import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            
            int length = commands[i][1]-commands[i][0]+1;
            int[] copy = new int[length];
            
            System.arraycopy(array,commands[i][0]-1,copy,0,length); // 1
            Arrays.sort(copy); // 2
            answer[i] = copy[commands[i][2]-1]; // 3
        }
        
        return answer;
    }
}