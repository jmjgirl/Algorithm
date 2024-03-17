import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 데이터 개수
        int[] ATM = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            ATM[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++) {
            for(int j=0; j<i; j++) {
                if(ATM[j] > ATM[i]) {
                    int temp = ATM[j];
                    ATM[j] = ATM[i];
                    ATM[i] = temp;
                }
            }
        }

        // 합 구하기
        int answer = 0;
        int num = N;
        for(int i=0; i<N; i++) {
            answer =  answer + (ATM[i]*num--);
        }

        System.out.println(answer);
    }
}