import java.util.*;
class Solution {
    public HashSet<Integer> set;
    public boolean[] visited;
    public int solution(String numbers) {
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        dfs(0,0, numbers);
        int answer = 0;
        //System.out.println(set.toString());
        
        for(int s : set) {
            int count = 0;
            if(s < 2) continue;
            for(int i=2; i<=s/2; i++) {
                if(s % i == 0) {
                    //System.out.println(s);
                    count++;
                    break;
                }
            }
            
            if(count == 0) answer++;
        }
        return answer;
    }
    
    public void dfs(int num, int dept, String numbers) {
        set.add(num);
        if(dept == numbers.length()) return;
        
        for(int i=0; i<numbers.length(); i++) {
            if(!visited[i]) { //방문하지 않은 상태
                String str = Integer.toString(num) + numbers.charAt(i);
                visited[i] = true;
                dfs(Integer.parseInt(str), dept+1, numbers);
                visited[i] = false;
            }
        }
        
    }
}