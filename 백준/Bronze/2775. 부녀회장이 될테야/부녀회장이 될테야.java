import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] D = new int[15][15];
        // D 초기화
        for(int j=0; j<=14; j++) {
            D[j][1] = 1; // j층 1호에는 1명이 산다
            if(j==0) continue;
            D[0][j] = j; // 0층의 i호에는 i명이 산다
        }

        for(int j=1; j<=14; j++) {
            for(int m=2; m<=14; m++) {
                D[j][m] = D[j-1][m] + D[j][m-1];
            }
        }

        int T = scan.nextInt(); // 질의 수
        for(int i=0; i<T; i++) {
            int k = scan.nextInt(); // 층
            int n = scan.nextInt(); // 호

            System.out.println(D[k][n]);
        }
    }
}