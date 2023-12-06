import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> map = new HashMap<>();
        
        int count = 0;
        for(int i=0; i<record.length; i++) {
            String[] part = record[i].split(" ");
            if(part[0].equals("Enter")) {
                map.put(part[1],part[2]);
                count++;
            } else if(part[0].equals("Change")) {
                map.put(part[1],part[2]);
            } else {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int index = 0;
        for(int i=0; i<record.length; i++) {
            String[] part2 = record[i].split(" ");
            if(part2[0].equals("Enter")) {
                answer[index++] = map.get(part2[1]) + "님이 들어왔습니다.";
            }else if(part2[0].equals("Leave")) {
                answer[index++] = map.get(part2[1]) + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}