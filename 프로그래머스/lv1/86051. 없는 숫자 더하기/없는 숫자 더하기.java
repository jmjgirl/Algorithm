class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int n : numbers){
            answer -= n;
        }
        /*
        int[] check = new int[10];
        for(int i=0; i<numbers.length; i++){
            check[numbers[i]] = 1;
        }
        
        for(int j=0; j<check.length; j++) {
            if(check[j] == 0) answer+=j;
        }
        */
        
        return answer;
    }
}