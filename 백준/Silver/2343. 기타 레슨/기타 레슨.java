import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 레슨 수
        int M = Integer.parseInt(st.nextToken()); // 블루레이 개수
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        int start = 0; // A 배열 중 최대값
        int end = 0; // A 배열의 합
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if(start < A[i]) start = A[i];
            end += A[i];
        }

        while(start <= end) {
            int mid = (start + end) / 2;
            int sum = 0; // 레슨 합
            int count = 0; // 현재 사용한 블루레이 개수
            for(int i=0; i<N; i++) {
                if(A[i] + sum > mid) {
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }

            if(sum!=0) count++; // 탐색 후 sum이 0이 아니면 블루레이 개수를 올려야 하므로

            if(count > M) start = mid + 1;
            else end = mid - 1;
        }

        System.out.println(start);
    }
}