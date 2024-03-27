import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 동전 종류 수
        int K = scan.nextInt(); // 목표 금액
        int[] money = new int[N];
        for(int i=0; i<N; i++) {
            money[i] = scan.nextInt();
        }

        int count = 0;
        for(int i=N-1; i>=0; i--) {
            if(money[i] <= K && K > 0) {
                count+= K / money[i];
                K = K % money[i];
            }
        }

        System.out.println(count);
    }
}