import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong(); // 수의 개수
        PriorityQueue<Long> plusPQ = new PriorityQueue<>(Collections.reverseOrder()); // 1제외 양수 (내림차순)
        PriorityQueue<Long> minusPQ = new PriorityQueue<>(); // 0포함 음수 (오름차순)
        long one = 0;
        for(int i=0; i<N; i++) {
            long num = scan.nextLong();
            if(num > 1) plusPQ.add(num);
            else if(num <= 0) minusPQ.add(num);
            else one++;
        }

        long answer = 0;
        // 양수
        while(plusPQ.size() > 1) {
            answer += plusPQ.poll() * plusPQ.poll();
        }
        if(plusPQ.size() == 1) answer += plusPQ.poll();

        // 음수
        while(minusPQ.size() > 1) {
            answer += minusPQ.poll() * minusPQ.poll();
        }
        if(minusPQ.size() == 1) answer += minusPQ.poll();

        // 나머지 1 더함
        answer += one;
        
        System.out.println(answer);
    }
}