import java.util.*;
class Solution {
    public int[] dx = {1, 0, -1, 0};
    public int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1]; // 종점
        // 상대 팀 진영에 도착할 수 없을 때
        if (answer == 0) answer = -1; 
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited) {
        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        // 시작점을 큐에 저장
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()) {
            int[] current = queue.remove();
            int cX = current[0]; 
            int cY = current[1];
            
            // 상하좌우 한칸씩 가면서 갈 수 있는 길 찾기
            for(int i=0; i<4; i++) {
                int mX = cX + dx[i];
                int mY = cY + dy[i];
                
                // 게임 맵을 벗어나면 다음 반복문으로
                if(mX < 0 || mX > maps.length-1 || mY < 0 || mY > maps[0].length-1)  continue;

                // 갈본적없는 길이면
                if(visited[mX][mY] == 0 && maps[mX][mY] == 1) {
                    // 큐에 저장하고
                    queue.add(new int[]{mX,mY}); 
                    // visited에도 표시 (지나온 값에 + 1)
                    visited[mX][mY] = visited[cX][cY] + 1;
                }
            }
            
        }
        
    }
}