import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean even;
    static boolean visited[];
    static int evengraph[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); // 데스트 케이스의 개수
        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken()); // 노드의 개수
            int E = Integer.parseInt(st.nextToken()); // 에지의 개수
            graph = new ArrayList[V+1];
            for(int j=1; j<=V; j++) {
                graph[j] = new ArrayList<>();
            }

            for(int j=0; j<E; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a].add(b);
                graph[b].add(a);
            }

            // DFS
            visited = new boolean[V+1];
            evengraph = new int[V+1];
            even = true;
            for(int j=1; j<=V; j++) {
                if(even) DFS(j);
                else break;
            }

            // 출력
            if(even) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static void DFS(int v) {
        visited[v] = true;
        for(int next : graph[v]) {
            if(!visited[next]) { // 방문 X
                evengraph[next] = (evengraph[v] + 1) % 2; // 반대로 나오게 0 or 1
                DFS(next);
            } else if(evengraph[next] == evengraph[v]) {
                // 방문노드가 현재 노드와 같다면
                even = false;
            }
        }
    }
}