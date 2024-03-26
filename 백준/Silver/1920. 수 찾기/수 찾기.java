import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 데이터 개수
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); // 찾아야할 숫자 개수
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 먼저 A 정렬
        Arrays.sort(A);

        for(int i=0; i<M; i++) {
            int count = 0;
            int left = 0;
            int right = N-1;
            while(Math.sqrt(N) + 1 >= count) {
                int mid = (right+left) / 2;
                if(A[mid] > B[i]) {
                    right = mid - 1;
                    count++;
                } else if (A[mid] < B[i]) {
                    left  = mid + 1;
                    count++;
                } else {
                    System.out.println("1");
                    break;
                }
            }

            if(Math.sqrt(N) + 1 < count) System.out.println("0");
        }
    }
}