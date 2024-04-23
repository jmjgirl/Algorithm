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
        int N = Integer.parseInt(br.readLine()); // 도시 개수
        int M = Integer.parseInt(br.readLine()); // 버스 개수
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        queue = new PriorityQueue<>((o1,o2) -> Integer.compare(o1.value,o2.value));
        StringTokenizer st;
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[a].add(new Node(b,v));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()); // 출발점
        int end = Integer.parseInt(st.nextToken()); // 도착점

        minArr = new int[N+1];
        for(int i=1; i<=N; i++) {
            if(i==start) continue;
            minArr[i] = Integer.MAX_VALUE;
        }

        queue.add(new Node(start,0));
        Daickstra();

        // 도착점 값 구하기
        System.out.println(minArr[end]);
    }

    static void Daickstra() {
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            int c_v = current.vertex;
            if(visited[c_v]) continue;
            visited[c_v] = true;
            for(Node next : graph[c_v]) {
                int vertex = next.vertex;
                int value = next.value;
                if(minArr[vertex] > minArr[c_v] + value) {
                    minArr[vertex] = minArr[c_v] + value;
                    queue.add(new Node(vertex, minArr[vertex]));
                }
            }
        }
    }
}

class Node {
    int vertex;
    int value;
    Node(int vertex, int value) {
        this.vertex = vertex;
        this.value = value;
    }
}