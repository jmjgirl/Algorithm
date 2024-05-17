import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] D = new int[31][31];
        // D 초기화
        for(int i=0; i<=30; i++) {
            D[i][0] = 1;
            D[i][i] = 1;
            D[i][1] = i;
        }

        for(int i=1; i<=30; i++) {
            for(int j=2; j<=i; j++) {
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            System.out.println(D[M][N]);
        }
    }
}