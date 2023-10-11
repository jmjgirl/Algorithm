import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // N/2
        int[] result = Arrays.stream(nums).distinct().toArray();
        //System.out.println(result.length);
        answer = result.length <= nums.length / 2 ? result.length : nums.length/2;
        return answer;
    }
}