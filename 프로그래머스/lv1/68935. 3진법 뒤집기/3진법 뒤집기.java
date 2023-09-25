class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuffer num3 = new StringBuffer(Integer.toString(n,3));
        String rvnum3 = num3.reverse().toString();

        return Integer.parseInt(rvnum3,3);

    }
}