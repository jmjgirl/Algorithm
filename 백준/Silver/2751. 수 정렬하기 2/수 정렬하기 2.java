import java.io.*;
import java.util.*;

public class Main {
    static int[] A;
    static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수의 개수
        A = new int[N+1]; // 처음 배열
        tmp = new int[N+1]; // 정렬할때 잠시 사용할 임시 배열
        for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        MergeSort(1,N); // 병합 정렬

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=N; i++) {
            bw.write(A[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void MergeSort(int s, int e) { //start, end
        if(e-s<1){ // 배열의 길이가 1 이하라면 이미 정렬된 상태이기 때문에 더 이상 분할할 필요가 없어서 재귀 호출 중단
            return;
        }
        int m = s + (e-s) / 2; // s + (e-s) / 2
        MergeSort(s,m);
        MergeSort(m+1, e);

        // tmp 배열 저장
        for(int i=s; i<=e; i++){
            tmp[i] = A[i];
        }

        // 두 그룹을 병합하는 로직
        int index = s;
        int index1 = s; // 앞쪽 그룹 시작점
        int index2 = m+1; // 뒤쪽 그룹 시작점
        while(index1 <= m && index2 <= e) {
            if(tmp[index1] > tmp[index2]) {
                A[index] = tmp[index2++];
                index++;
            }else {
                A[index] = tmp[index1++];
                index++;
            }
        }

        // 반복문의 끝난 후 남아 있는 데이터 정리
        while(index1 <= m) {
            A[index++] = tmp[index1++];
        }
        while(index2 <= e) {
            A[index++] = tmp[index2++];
        }

    }
}