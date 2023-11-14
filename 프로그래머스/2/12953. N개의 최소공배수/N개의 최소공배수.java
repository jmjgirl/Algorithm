import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int GCD = arr[0];
        int answer = GCD;
        
        for(int i=1; i<arr.length; i++) {
            GCD = gcd(answer, arr[i]);
            answer = answer / GCD * arr[i];
        }
        
        return answer;
    }
    
    int gcd(int a, int b) {
        if(b==0)
            return a;
        else 
            return gcd(b, a%b);
    }
}