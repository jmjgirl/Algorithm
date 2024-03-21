import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 노드의 개수
        int M = Integer.parseInt(st.nextToken()); // 에지의 개수
        int V = Integer.parseInt(st.nextToken()); // 시작점
        graph = new ArrayList[N+1];

        // 그래프 초기화
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 간선 추가 (양방향)
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // 번호가 작은 것을 방문하기 위해 정렬
        for(int i=1; i<=N; i++) {
            Collections.sort(graph[i]);
        }

        dfsVisited = new boolean[N+1];
        dfs(V);
        System.out.println();
        bfsVisited = new boolean[N+1];
        bfsVisited[V] = true;
        bfs(V);
    }

    public static void dfs(int v) {
        System.out.print(v + " ");
        dfsVisited[v] = true;
        for(int next : graph[v]) {
            if(!dfsVisited[next]) { // 아직 방문하지 X
                dfs(next);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        // 시작점을 큐에 저장
        queue.add(v);

        while(!queue.isEmpty()) {
            int nowV = queue.poll();
            System.out.print(nowV + " ");
            for(int next : graph[nowV]) {
                if(!bfsVisited[next]) { // 아직 방문하지 X
                    bfsVisited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}