import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        char[] sumArr = input.toCharArray();

        int answer = 0;
        for(int i=0; i<N; i++) {
            answer += sumArr[i] - '0';
        }
        System.out.println(answer);
    }
}