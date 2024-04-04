import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long result = n;

        for(long p=2; p<=Math.sqrt(n); p++) {
            if(n%p == 0) {
                result = result - result/p;
                while(n%p == 0) {
                    n/=p;
                }
            }
        }

        if(n>1) {
            result = result - result/n;
        }
        System.out.println(result);

        /* 처음 배열 사용 풀이
        long[] arr = new long[(int) (n+1)]; // 배열
        // 배열 초기화
        for(int i=0; i<arr.length; i++) {
            arr[i] = i;
        }

        // 2부터 배수 갱신
        for(int i=2; i<=n; i++) {
            for(int j=1; i*j<=n; j++) {
                arr[i*j] = arr[i*j] - (arr[i*j]/i);
            }
        }

        System.out.println(arr[(int)n]);
         */
    }
}