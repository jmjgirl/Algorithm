import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
            System.out.println(sizes[i][0]);
        }
        
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        for(int j=0; j<sizes.length; j++) {
            System.out.println(sizes[j][0]);
            if(sizes[j][0] > maxW) maxW = sizes[j][0];
            if(sizes[j][1] > maxH) maxH = sizes[j][1];
        
        }
        
        System.out.println(maxW);
        System.out.println(maxH);
        
        return maxW * maxH;
    }
}