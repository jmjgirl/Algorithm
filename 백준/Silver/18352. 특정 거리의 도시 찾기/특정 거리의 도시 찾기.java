import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] countArr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시 개수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        int K = Integer.parseInt(st.nextToken()); // 거리 정보
        int X = Integer.parseInt(st.nextToken()); // 출발 도시 번호

        graph = new ArrayList[N+1];
        // 그래프 초기화
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 도로
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
        }

        visited = new boolean[N+1];
        countArr = new int[N+1];
        BFS(X);

        ArrayList<Integer> answer = new ArrayList<>();
        //K 거리 인지 확인
        for(int i=1; i<=N; i++) {
            if(countArr[i] == K) {
                answer.add(i);
            }
        }


        if(answer.isEmpty()) System.out.println(-1);
        else {
            Collections.sort(answer);
            for(int temp : answer) {
                System.out.println(temp);
            }
        }
    }

    static void BFS(int X) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        visited[X] = true;

        while(!queue.isEmpty()) {
            int city = queue.poll();
            for(int num : graph[city]) {
                // 방문하지 않았다면
                if(!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                    countArr[num] = countArr[city] + 1;
                }
            }
        }
    }
}