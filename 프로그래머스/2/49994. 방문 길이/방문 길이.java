import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        char[] dir = dirs.toCharArray();
        int x = 0;
        int y = 0;

        for(int i=0; i<dir.length; i++) {
            int pX = x;
            int pY = y;
            if(dir[i] == 'U' && y < 5) {
                y += 1;
            }
            else if(dir[i] == 'D' && y > -5) {
                y-=1;
            }
            else if(dir[i] == 'R' && x < 5) {
                x+=1;
            }
            else if(dir[i] == 'L' && x > -5) {
                x-=1;
            }

            if(pX == x && pY == y) {
                continue;
            }
    
            set.add("" + pX + pY + x + y);
            set.add("" + x + y + pX + pY);
        }
        
        answer = set.size()/2;
        return answer;
    }
}