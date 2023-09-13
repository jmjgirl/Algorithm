class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] words = {"aya", "ye", "woo", "ma"};
        
        for(int j=0; j<babbling.length; j++) {
            for (int i=0; i<words.length; i++) {
                if(babbling[j].contains(words[i])) {
                    babbling[j] = babbling[j].replace(words[i]," ");
                }
            }
            
            int count = 0;
            for(int k=0; k<babbling[j].length(); k++) {
                if(String.valueOf(babbling[j].charAt(k)).equals(" ")) {
                    count++;
                }
            }
            
            if(count == babbling[j].length()) {
                answer++;
            }
        }
        return answer;
    }
}