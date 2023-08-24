import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        // sides[1]이 가장 긴 변인 경우 : 다른 두변의 길이의 합보다 작아야함
        answer += sides[1] - (sides[1] - sides[0]);
        
        // 나머지 한 변이 가장 긴 변인 경우
        answer += (sides[1] + sides[0]) - sides[1] - 1;
        
        return answer;
    }
}