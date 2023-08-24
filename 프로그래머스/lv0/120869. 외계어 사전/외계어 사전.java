class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int count = 0;
        for (int j = 0; j < dic.length; j++) {
            count = 0;
            for(int i = 0; i < spell.length; i++) {
                if (dic[j].contains(spell[i])) {
                    count++;
                }
                
                if (count == spell.length) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}