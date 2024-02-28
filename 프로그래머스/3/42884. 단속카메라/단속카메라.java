import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        // 진출 지점을 기준으로 오름차순
        Arrays.sort(routes, (o1, o2) -> {
            return o1[1] - o2[1]; 
        });
        
        int camera = routes[0][1]; // 첫번째 진출 지점
        answer++;
        for(int i=0; i<routes.length; i++) {
            if(camera >= routes[i][0] && camera <= routes[i][1]) continue;
            
            camera = routes[i][1]; // 진출 지점
            answer++;
        }
        return answer;
    }
}