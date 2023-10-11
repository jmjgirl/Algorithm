import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int[] result = Arrays.stream(nums).distinct().toArray();

        if(result.length <= nums.length / 2) answer = result.length;
        else answer = nums.length/2;
        return answer;
    }
}