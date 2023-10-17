class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama", " ");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
        }
        
        for(int i=0; i<babbling.length; i++) {
            if(babbling[i].length() == 0) answer++;
        }
        return answer;
    }
}