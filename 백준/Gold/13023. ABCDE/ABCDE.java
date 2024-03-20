import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N;
    static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int M = scan.nextInt();
        graph = new ArrayList[N];
        visited = new boolean[N];

        // 그래프 초기화
        for(int i=0; i<N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        count = 0;
        for(int i=0; i<N; i++) {
            dfs(i,1); //dept : 1부터 시작
        }
        System.out.println(count);
    }

    public static void dfs(int v, int dept) {
        if(dept==5 || count == 1) { // 여기 count == 1 안해줘서 시간초과 났어...ㅎ 하...
            count = 1;
            return;
        }

        visited[v] = true;
        for(int next : graph[v]) {
            if(!visited[next]) {
                dfs(next,dept+1);
            }
        }
        visited[v] = false;
    }
}