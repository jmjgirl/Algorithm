import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] numArr = new long[N+1];
        for(int i=1; i<=N; i++) {
            numArr[i] = numArr[i-1] + Long.parseLong(st.nextToken());
        }

        // 나머지 연산 배열에 저장
        long answer = 0;

        long[] modArr = new long[M];
        for(int i=1; i<=N; i++) {
            int mod = (int) (numArr[i] % M);
            modArr[mod]++;

            if(mod == 0) answer++;
        }

        // 나머지 값이 같은 합 배열의 개수 계산
        for(int i=0; i<M; i++) {
            if(modArr[i] > 1) answer = answer + modArr[i] * (modArr[i]-1) / 2;
        }

        System.out.println(answer);
    }
 }