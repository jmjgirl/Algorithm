import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수의 개수

        long[] numArr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            numArr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(numArr); // 정렬
        int answer = 0;
        for(int k=0; k<N; k++) {
            long find = numArr[k]; // 더해서 값이 나와야하는 수
            int left = 0;
            int right = N-1;
            while(left < right) {
                if(numArr[left] + numArr[right] == find) {
                    if(left != k && right != k) { // 자기 자신을 포함하면 안됨
                        answer++;
                        break;
                    } else if(left == k) {
                        left++;
                    } else if(right == k) {
                        right--;
                    }
                } else if(numArr[left] + numArr[right] > find) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        /*
        int startIndex = 0;
        int endIndex = 1;
        int sumIndex = 2;
        int answer = 0;
        while(sumIndex <= N-1){
            if(numArr[startIndex] + numArr[endIndex] == numArr[sumIndex]) {
                if(startIndex != endIndex) { //다른 두수의 합
                    answer++;
                    sumIndex++;
                    endIndex++;
                }
            } else if(numArr[startIndex] + numArr[endIndex] > numArr[sumIndex]) {
                startIndex--;
            } else {
                startIndex++;
            }
        }
         */

        System.out.println(answer);
    }
 }