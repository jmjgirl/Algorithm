import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 2차원 배열의 크기
        int M = Integer.parseInt(st.nextToken()); // 구간 합 질의의 개수

        int[][] numArr = new int[N + 1][N + 1];
        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합 배열 구하기
        int[][] sumArr = new int[N + 1][N + 1];
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + numArr[i][j];
            }
        }

        // 구간 합 구하기
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1]);
        }
    }
 }