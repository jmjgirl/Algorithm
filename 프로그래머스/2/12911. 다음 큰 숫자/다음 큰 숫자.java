class Solution {
    public int solution(int n) {
        
      int a = Integer.bitCount(n);
      int answer = n+1;
        
      while(true) {
          
        if(Integer.bitCount(answer)==a)
        break;
        answer++;
      }
        /*
        int answer = n+1;
        int count1 = 0;
        
        char[] arr1 = Integer.toBinaryString(n).toCharArray();
        for(char c : arr1) {
            if(c == '1') count1++;
        }
        
        int count2 = 0;
        while(answer > n) {
            char[] arr2 = Integer.toBinaryString(answer).toCharArray();
            for(char c : arr2) {
                if(c == '1') count2++;
            }
            
            if(count1 == count2) {
                break;
            } else {
                count2 = 0;
                answer++;
            }
        }
        */
        
        return answer;
    }
}