import java.io.*;
import java.util.*;

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
// swap이 한번도 일어나지 않은 loop가 언제인지
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열의 크기
        mData[] A = new mData[N];

        for(int i=0; i<N; i++) {
            A[i] = new mData(Integer.parseInt(br.readLine()),i);
        }

        Arrays.sort(A);
        // 최대값 + 1
        int max = 0;
        for(int i=0; i<N; i++) {
            if(max < A[i].index - i) max = A[i].index - i;
        }

        System.out.println(max + 1);
    }
}