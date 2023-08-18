class Solution {
    public String solution(int age) {
        String [] arr = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = "";
        
        while(age > 0) {
            answer += arr[age%10];
            age = age / 10;
        }
        
        return new StringBuffer(answer).reverse().toString();
    }
}