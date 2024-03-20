import java.io.*;
import java.util.Scanner;

public class Main {
    public static int N;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        dfs(0,0);
    }

    private static void dfs(int dept, int num) {
        if(dept == N) {
            System.out.println(num);
            return;
        }

        for(int i=1; i<=9; i++) {
            // 만약 짝수라면 시도해볼 필요도 X
            //if(num%2==0) continue;

            if(isPrime(10*num+i)) { //소수이면
                dfs(dept+1,10*num+i);
            }
        }
    }

    // 소수인지 아닌지만 알면됨!
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i=2; i<= Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}