import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 연산의 개수

        // 람다식 사용해서 정렬 중요!!!!!
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs) return o1 > o2 ? 1 : -1; // 절댓값이 같으면 음수 먼저 정렬
            else return first_abs - second_abs; // 절대값 기준으로 정렬
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x!=0) {
                pq.add(x);
            }else{
                if(!pq.isEmpty()) {
                    bw.write(pq.poll() + "\n");
                }else {
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}