class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int num = 0;
        for (int i = 1; i < k; i++) {
            num +=2;
            
            if (num > numbers.length-1) {
                num = num - numbers.length;
            }
            
            answer = numbers[num];
        }
        return answer;
    }
}