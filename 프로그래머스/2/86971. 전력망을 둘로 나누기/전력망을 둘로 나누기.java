import java.util.*;
import java.math.*;
class Solution {
    public ArrayList<Integer>[] graph;
    public int min;
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n+1]; // 인접 노드 리스트 저장한 배열
        min = Integer.MAX_VALUE;    // 트리 최소 크기
        
        // 1. 그래프 초기화
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        // 2. 양방향 간선 추가
        for(int i=0; i<n-1; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].add(v2);
            graph[v2].add(v1);
            
        }
        
        // 3. 입력된 간선을 하나씩 제거하면서 그래프를 두개의 그룹으로 분리
        for(int i=0; i<n-1; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            boolean visited[] = new boolean[n+1];
            
            // 해당 간선을 그래프에서 제거
            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));
            
            // dfs 함수 호출
            int count = dfs(1, visited);
            
            // 각 그룹의 노드 차이 계산
            int diff = Math.abs(count - (n - count));
            min = Math.min(min, diff);
            
            // 제거한 간선 다시 graph에 추가
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        return min;
    }
    
    // 4. dfs 함수
    public int dfs(int v, boolean[] visited) {
        // 현재 노드 v 방문처리
        visited[v] = true; 
        // 노드 개수 변수 count 1로 초기화
        int count = 1;
        
        for(int next : graph[v]) {
            if(!visited[next]) { // 방문하지 않은 곳이라면
                count += dfs(next, visited); // 방문하면서 cnt 업데이트
            }
        }
        
        return count;
    }
}