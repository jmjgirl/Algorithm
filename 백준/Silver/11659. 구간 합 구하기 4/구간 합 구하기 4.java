import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 데이터의 개수
        int M = Integer.parseInt(st.nextToken()); // 질의 개수

        st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N+1];
        for(int i=1; i<=N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        // 합배열 만들기
        int[] sumArr = new int[N+1];
        sumArr[1] = numArr[1];
        for(int i=2; i<=N; i++) {
            sumArr[i] = sumArr[i-1] + numArr[i];
        }

        // 구간 합 출력하기
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()); // 시작
            int end = Integer.parseInt(st.nextToken()); // 끝
            System.out.println(sumArr[end] - sumArr[start-1]);
        }
    }
}