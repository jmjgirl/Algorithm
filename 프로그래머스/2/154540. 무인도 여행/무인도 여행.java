import java.util.*;
class Solution {
    public ArrayList<Integer> arr;
    public String[][] visited;
    public int days;
    public int[] solution(String[] maps) {
        arr = new ArrayList<>();
        
        // visited에 입력
        visited = new String[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[0].length(); j++) {
                visited[i][j] = maps[i].charAt(j) + "";
            }
        }
        
        //dfs
        for(int i=0; i<visited.length; i++) {
            for(int j=0; j<visited[0].length; j++) {
                days = 0;
                if(!visited[i][j].equals("X")) {
                    dfs(i,j);
                    arr.add(days);
                }
            }
        }
        
        if(arr.size() == 0) return new int[]{-1}; // 섬이 존재하지 않다면
        Collections.sort(arr); //오름차순
        int[] answer = new int[arr.size()];
        int index = 0;
        for(int num : arr) {
            answer[index++] = num;
        }
        
        
        
        return answer;
    }
    
    public void dfs(int x, int y) {
        if(x<=-1 || x>=visited.length || y<=-1 || y>=visited[0].length) return;
        
        // 방문하지 않았다면 (바다가 아니라면)
        if(!visited[x][y].equals("X")) {
            days += Integer.parseInt(visited[x][y]);
            visited[x][y] = "X"; // 방문 표시
            
            dfs(x-1,y); // 하
            dfs(x+1,y); // 상
            dfs(x,y-1); // 좌
            dfs(x,y+1); // 우
        }
    }
}