import java.math.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기
        // limit보다 큰 공격력을 가진 무기를 구매하는 기사 -> 협역기관에서 정한 power을 가지는 무기 구매
        
        int weapon = 0;
        int num = 0;
        for(int i=1; i<=number; i++) {
            //num = i % 2 == 1 ? i/2+1 : i/2;
            for(int j=1; j<=Math.sqrt(i); j++) {
                //System.out.println(Math.ceil(i/2));
                if(i % j == 0) weapon++;
                //System.out.println(i + ":" + weapon);
            }
            //System.out.println(weapon);
   
            
    
            if(i % Math.sqrt(i) == 0) {
                weapon = weapon*2 - 1;
            } else {
                weapon = weapon*2;
            }
            
            answer += weapon <= limit ? weapon : power;
            
            weapon = 0;
        }
        
        return answer;
    }
}