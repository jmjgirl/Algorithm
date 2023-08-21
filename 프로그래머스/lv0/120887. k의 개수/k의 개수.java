class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int start = i; start <= j; start++) {
            String kstr = String.valueOf(start);
            
            for (int a = 0; a < kstr.length(); a++) {
                if (String.valueOf(k).equals(kstr.substring(a,a+1))) {
                    answer +=1;
                }
            }
        }
        return answer;
    }
}