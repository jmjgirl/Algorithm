class Solution {
    public String solution(String number, int k) {
        // 각 자리에서 최고로 높은 수가 나와야함
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        char[] array = number.toCharArray();
        int len = array.length - k;
        
        // 문자 비교를 시작하는 인덱스를 나타냄
        int index = 0;
        for(int i=0; i<len; i++) {
            char max = '0';
            for(int j=index; j<=i+k; j++) {
                // 가장 큰 수를 골라 다음 인덱스
                if(array[j] > max) {
                    max = array[j];
                    index = j+1;
                }
            }
            // 가장 큰 문자를 String에 넣어주기
            sb.append(Character.toString(max));
        }
        
        answer = new String(sb);
        return answer;
    }
}