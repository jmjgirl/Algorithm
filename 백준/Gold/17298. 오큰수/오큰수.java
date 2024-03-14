import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열 A의 크기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N]; // 수열 배열
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] outArr = new int[N];

        for(int i=1; i<N; i++) {
            if(A[stack.peek()] < A[i]) { // 가장 크니 출력 후 push
                while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
                    outArr[stack.pop()] = A[i];
                }
                stack.push(i);
            } else if(A[stack.peek()] >= A[i]) { // 같거나 작으니 push
                stack.push(i);
            }
        }

        while(!stack.isEmpty()) {
            outArr[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++) {
            //System.out.print(outArr[i] + " ");
            bw.write(outArr[i] + " ");
        }

        bw.flush();
    }
}