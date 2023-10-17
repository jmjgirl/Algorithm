class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya","ye","woo","ma"};
        
        for(int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama", " ");
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
            /*
            for(int j=0; j<baby.length; j++) {
                babbling[i] = babbling[i].replace(baby[j],"");
            }  
            */
            //System.out.println(babbling[i]);
        }
        
        
        for(int i=0; i<babbling.length; i++) {
            if(babbling[i].length() == 0) answer++;
        }
        return answer;
    }
}