import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 배열의 크기
        int k = scan.nextInt();

        long start = 1;
        long end = k;
        long answer = 0;
        while(start <= end) {
            long mid = (start+end)/2;
            long cnt = 0; // 중앙값보다 작은 수

            // 중앙값보다 작은 수는 몇 개인지 계산
            for(int i=1; i<=N; i++) {
                cnt += Math.min(mid/i, N);
            }

            if(cnt < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }
}
