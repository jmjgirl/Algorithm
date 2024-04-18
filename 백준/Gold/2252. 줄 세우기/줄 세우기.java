import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] D; //진입차수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드 개수
        int M = Integer.parseInt(st.nextToken()); // 에지 개수

        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        D = new int[N+1];
        // 그래프, 진입차수 설정 완
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
            D[B]++;
        }

        // 위장 정렬
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            if(D[i] == 0) {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()) {
            int q = queue.poll();
            System.out.print(q + " ");
            for(int next : graph[q]) {
                D[next]--;
                if(D[next] == 0) {
                    queue.offer(next);
                    //System.out.print(next + " ");
                }
            }
        }
    }
}