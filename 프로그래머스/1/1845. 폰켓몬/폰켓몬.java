import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // N/2
        int[] result = Arrays.stream(nums).distinct().toArray();
        //System.out.println(result.length);
        if(result.length <= nums.length / 2) answer = result.length;
        else answer = nums.length/2;
        return answer;
    }
}