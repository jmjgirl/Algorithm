import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 회의 개수
        int[][] meet = new int[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meet[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
            meet[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
        }

        // 종료시간 기준 오름차순, 같으면 시작시간 기준 내림차순
        Arrays.sort(meet,(o1, o2) -> {
            if(o1[1] == o2[1]) { // 종료시간 같으면
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = 0;
        int end = -1;
        for(int i=0; i<N; i++) {
            if(end <= meet[i][0]) {
                count++;
                end = meet[i][1];
            }
        }

        System.out.println(count);
    }
}