import java.io.IOException;
import java.util.*;


// 더한 값을 다시 큐에 넣고 그안에서 다시 정렬해야함!
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 카드 묶음 수
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            pq.add(scan.nextLong());
        }

        // greedy : 두개는 남아 있어야한다
        long answer = 0;
        while(pq.size() > 1) {
            long tmp = pq.poll() + pq.poll();
            answer += tmp;
            pq.add(tmp);
        }


        System.out.println(answer);
    }
}