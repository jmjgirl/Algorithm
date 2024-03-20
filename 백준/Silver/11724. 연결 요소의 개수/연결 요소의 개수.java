import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<Integer>[] graph;
    public static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드의 개수
        int M = Integer.parseInt(st.nextToken()); // 에지의 개수

        graph = new ArrayList[N+1];
        // 그래프 초기화 (중요)
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 인접 리스트로 그래프 표현 (방향 없는 그래프 -> 양쪽 다 저장)
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[N+1];
        for(int i=1; i<=N; i++) {
            if(!visited[i]) { // 방문하지 않은 곳이 있으면 반복
                count++;
                dfs(i,visited);
            }
        }

        System.out.println(count);
    }

    public static void dfs(int v, boolean[] visited) {
        visited[v] = true;
        for(int next : graph[v]) {
            if(!visited[next]) { // 방문하지 않은 곳이라면
                dfs(next,visited);
            }
        }
    }
}