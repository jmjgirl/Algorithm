import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[10000001]; // 1이면 소수 아님
        arr[1] = 1;
        for(int i=2; i<=Math.sqrt(arr.length); i++) {
            if(arr[i] == 1) continue;
            for(int j=i+i; j<arr.length; j+=i) {
                arr[j] = 1;
            }
        }

        int i = N;
        while(true) { // 팰린드롬 구하기
            if(arr[i] != 1) {
                if(isPalindrome(i)) {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }

    static boolean isPalindrome(int num) {
        char[] cArr = String.valueOf(num).toCharArray();
        int start = 0;
        int end = cArr.length-1;
        while(start<end) {
            if(cArr[start] != cArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}