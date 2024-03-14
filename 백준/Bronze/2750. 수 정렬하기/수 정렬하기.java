import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 수의 개수
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }

        int temp = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println(arr[i]);
        }
    }
}