import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        boolean[] arr = new boolean[N+1];
        // 에라토스테네스의 체
        for(int i=2; i<N; i++) {
            for(int j=i+i; j<=N; j+=i) {
                arr[j] = true;
            }
        }

        // 소수 구하기
        for(int i=M; i<=N; i++) {
            if(i==1) continue;
            if(arr[i] == false) System.out.println(i);
        }
    }
}