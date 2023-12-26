class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            // 1
            if(numbers[i] % 4 != 3) answer[i] = numbers[i] + 1;
            else { // 2
                String binary = Long.toBinaryString(numbers[i]);
                int idx = binary.lastIndexOf("0");
                // 2-1 
                if(idx != -1) {
                    String tmp = binary.substring(0,idx) + "10" + binary.substring(idx+2, binary.length());
                    answer[i] = Long.parseLong(tmp,2);
                } else { // 2-2. 모두 1로만 이루어질때
                    String tmp = "10" + binary.substring(1,binary.length());
                    answer[i] = Long.parseLong(tmp,2);
                }
                
            }
        }
        return answer;
    }
}