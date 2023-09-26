import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        for(int j=0; j<sizes.length; j++) {
            if(sizes[j][0] > maxW) maxW = sizes[j][0];
            if(sizes[j][1] > maxH) maxH = sizes[j][1];
        
        }
        
        return maxW * maxH;
    }
}