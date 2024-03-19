import java.io.*;

public class Main {
    public static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        RadixSort(A,5); // 문제에 10,000보다 작거나 같은 자연수라고 했으니까

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static void RadixSort(int[] A, int maxSize){
        int[] output = new int[A.length]; // 임시 정렬을 위한 배열
        int jarisu = 1; // 현재 자릿수를 표현
        int count = 0;
        while(count!=maxSize) { // 최대 자릿수 만큼 반복
            int[] bucket = new int[10]; // 현재 자릿수들의 분포를 합 배열의 형태로 알려주는 배열
            for(int i=0; i<A.length; i++) {
                bucket[(A[i]/jarisu) % 10]++; // 일의 자릿수 부터 시작
            }

            for(int i=1; i<10; i++) {
                bucket[i] += bucket[i-1]; // 합 배열을 이용해 index 계산
            }

            for(int i=A.length-1; i>=0; i--) {  // 현재 자릿수 기준을 정렬
                output[bucket[(A[i] / jarisu % 10)]-1] = A[i];
                bucket[(A[i] / jarisu) % 10]--;
            }

            for(int i=0; i<A.length; i++){
                // 다음 자릿수를 이동하기 위해 현재 자릿수 기준 정렬 데이터 저장
                A[i] = output[i];
            }

            jarisu = jarisu * 10; //자릿수 증가
            count++;

        }
    }
}