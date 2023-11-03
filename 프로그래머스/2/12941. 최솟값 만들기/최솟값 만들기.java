import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //Integer[] IntB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        
        // A는 오름차순 B는 내림차순
        Arrays.sort(A);
        Arrays.sort(B);
        //Arrays.sort(IntB, Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length-i-1]; 
        }
        //System.out.println(Arrays.toString(A));

        return answer;
    }
}