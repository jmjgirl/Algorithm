import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 자연수 N

        int answer = 1;
        int startIndex = 0;
        int endIndex = 1;
        int tmp = 1;
        while(endIndex<N) {
            if(tmp<N) {
                endIndex++;
                tmp += endIndex;
            } else if(tmp > N) {
                tmp -= startIndex;
                startIndex++;
            } else { // tmp = N
                answer++;
                endIndex++;
                tmp += endIndex;
            }
        }

        System.out.println(answer);
    }
 }