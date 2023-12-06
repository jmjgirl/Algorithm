import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                // 숫자 앞부분 잘라서 head
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];
                
                //compareTo 사용한 비교를 위해서 모두 소문자로 변경 후 비교
                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                
                // 같은 문자일 경우 숫자로 비교
                if(result == 0) {
                    result = convertNum(o1,head1) - convertNum(o2, head2);
                }
                
                return result;
                
            }
        });
        
        
        return files;
    }
    
    public int convertNum(String str, String head) {
        // head 길이만 큼 잘라서 숫자부터 시작
        str = str.substring(head.length());
        String result = "";
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c) && result.length() < 5) result+=c;
            else break;
        }
        return Integer.parseInt(result);
    }
}