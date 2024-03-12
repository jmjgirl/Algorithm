import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 완성되는 번호의 합
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numArr = new int[N];
        for(int i=0; i<N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr);
        int startIndex = 0;
        int endIndex = N-1;
        int answer = 0;
        int sum = numArr[startIndex] + numArr[endIndex];

        while(startIndex < endIndex) {
            if(startIndex >= N-1 || endIndex <= 0) break;
            if(sum < M) {
                sum -= numArr[startIndex];
                startIndex++;
                sum += numArr[startIndex];
            } else if(sum > M) {
                sum -= numArr[endIndex];
                endIndex--;
                sum += numArr[endIndex];
            } else { //sum == M
                answer++;
                endIndex--;
                startIndex++;
                sum = numArr[endIndex] + numArr[startIndex];
            }
        }

        System.out.println(answer);
    }
 }