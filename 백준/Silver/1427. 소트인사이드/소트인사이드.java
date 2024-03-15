import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        int[] A = new int[N.length()];
        for(int i=0; i<N.length(); i++) {
            A[i] = N.charAt(i)-'0';
        }

        for(int i=0; i<A.length-1; i++) {
            int maxIndex = i;
            for(int j=i+1; j<A.length; j++) {
                if(A[maxIndex] < A[j]) {
                    maxIndex = j;
                };
            }

            int temp = A[i];
            A[i] = A[maxIndex];
            A[maxIndex] = temp;
        }

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]);
        }
    }
}