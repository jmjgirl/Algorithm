import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 원소의 개수
        int m = Integer.parseInt(st.nextToken()); // 질의 개수

        arr = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = i;
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // UNION
            if(num == 0) {
                Union(a,b);
            } else {
                if(Find(a) == Find(b)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

    static void Union(int a, int b) {
        a = Find(a);
        b = Find(b);
        if(a!=b) {
            arr[b] = a;
        }
    }

    static int Find(int n) {
        if(arr[n] != n) {
            return arr[n] = Find(arr[n]);
        } else {
            return n;
        }
    }
}