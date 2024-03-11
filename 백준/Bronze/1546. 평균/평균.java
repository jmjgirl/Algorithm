import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] score = new Integer[N]; // 시험 성적
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score, Collections.reverseOrder());

        int M = score[0]; // 최댓값
        double sumScore = 0; // 합계
        for(int i=0; i<N; i++) {
            sumScore += (double)score[i]/M*100;
        }
        
        System.out.println(sumScore/N);
    }
}