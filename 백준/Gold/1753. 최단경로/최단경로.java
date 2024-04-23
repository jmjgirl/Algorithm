import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Node>[] graph;
    static boolean visited[];
    static int minArr[];
    static PriorityQueue<Node> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken()); // 노드 개수
        int E = Integer.parseInt(st.nextToken()); // 에지 개수

        graph = new ArrayList[V+1];
        for(int i=1; i<=V; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[V+1];
        queue = new PriorityQueue<>(((o1, o2) -> Integer.compare(o1.w, o2.w))); // 꼭해줘야함

        int K = Integer.parseInt(br.readLine()); // 시작점
        minArr = new int[V+1];
        for(int i=1; i<=V; i++) { // 시작점만 0
            if(i==K) continue;
            minArr[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v,w));
        }

        // 우선순위 큐에 시작점 저장
        queue.add(new Node(K,0));
        // 다익스트라
        Daikstra();

        // 최단 경로값 출려
        for(int i=1; i<=V; i++) {
            if(minArr[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(minArr[i]);
        }
    }

    static void Daikstra() {
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            int c_v = current.v;
            
            if(visited[c_v]) continue; // 이미 방문하면 큐에 넣지 않음
            visited[c_v] = true;
            for(Node n : graph[c_v]) {
                int next = n.v;
                int value = n.w;
                minArr[next] = Math.min(minArr[c_v] + value, minArr[next]);
                //queue.add(new Node(next,value));
                queue.add(new Node(next,minArr[next]));
            }
        }
    }

    static class Node{
        int v;
        int w; // 가중치

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}