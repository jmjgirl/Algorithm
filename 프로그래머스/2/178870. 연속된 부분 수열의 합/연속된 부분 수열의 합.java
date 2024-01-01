import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> list;
    public boolean[] visited;
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2]; // 시작인덱스, 마지막 인덱스
        //list = new ArrayList<>();
        //visited = new boolean[sequence.length];
        //dfs(sequence, 0, k, 0);
        
        int min = 1000001;
        int front = 0;
        int back = 0;
        int sum = 0;
        while(true) {
            if(sum >= k) {
                sum -= sequence[front++];
            } 
            else if(back >= sequence.length) break;
            else if(sum < k) {
                sum += sequence[back++];
            } 
            
 
            
            if(sum == k) {
                if(min > back - front) {
                    min = back - front;
                    System.out.println(min);
                    answer[0] = front;
                    answer[1] = back-1;
                }
            }
            
        }

        return answer;
    }
    
    
    /*
    public void dfs(int[] sequence, int dept, int k, int sum) {
        if(dept == sequence.length || sum == k) return;
        
        for(int i=0; i<sequence.length; i++) {
            if(!vistied[i]) {
                visited[i] = true;
                dfs(sequence, dept+1, k, sum + sequence[i])
            }
        }
    }
    */
}