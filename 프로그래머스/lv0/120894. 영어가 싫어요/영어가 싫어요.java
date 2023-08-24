class Solution {
    public long solution(String numbers) {
        
        String [] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < number.length; i++) {
            if (numbers.contains(number[i])) {
                numbers = numbers.replaceAll(number[i], i+"");
            }
        }
        
        long answer = Long.parseLong(numbers);
        
        return answer;
    }
}