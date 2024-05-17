import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int[][] DP = new int[N+1][N+1];
        /** DP 배열 초기화
         *  1. i개 중 1개를 뽑는 경우의 수는 i개
         *  2. i개 중 1개도 선택하지 않는 경우의 수는 1개
         *  3. i개 중 i개를 선택하는 경우의 수는 1개
         */
        for(int i=0; i<=N; i++) {
                DP[i][1] = i;
                DP[i][0] = 1;
                DP[i][i] = 1;
        }

        for(int i=2; i<=N; i++) {
            for(int j=1; j<i; j++) { // 고르는 수의 개수가 전체 수를 넘을 수 없음
                DP[i][j] = DP[i-1][j-1] + DP[i-1][j];
            }
        }

        System.out.println(DP[N][K]);
    }
}