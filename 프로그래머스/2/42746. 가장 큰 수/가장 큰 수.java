import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        // 1. String 배열 생성
        String[] stringNumbers = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // 2. sort
        Arrays.sort(stringNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return(s2+s1).compareTo(s1+s2);
            }
        });
        
        // System.out.println(Arrays.toString(stringNumbers));
        
        if(stringNumbers[0].equals("0")) {
            return "0";
        } else {
            for(int i=0; i<stringNumbers.length; i++) {
                answer += stringNumbers[i];
            }
        }
        return answer;
    }
}