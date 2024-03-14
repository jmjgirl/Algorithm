import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        // 1개 남을때까지
        while(queue.size()!=1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}