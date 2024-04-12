import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 도시 개수
        int M = Integer.parseInt(br.readLine()); // 여행 경로 데이터

        arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = i;
        }

        int[][] connect = new int[N][N];
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                connect[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] route = new int[M+1]; // 여행 계획
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=M; i++) {
            route[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(connect[i][j] == 1) {
                    UNION(i+1,j+1);
                }
            }
        }

        // route에 포함하는 대표값이 모두 동일한지
        int index = Find(route[1]);
        for(int i=2; i<route.length; i++) {
            if(index != Find(route[i])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    static void UNION(int a, int b) {
        a = Find(a);
        b = Find(b);
        if(a!=b) {
            arr[b] = a;
        }
    }

    static int Find(int n) {
        if(arr[n] != n) {
            return arr[n] = Find(arr[n]);
        } else {
            return n;
        }
    }
}