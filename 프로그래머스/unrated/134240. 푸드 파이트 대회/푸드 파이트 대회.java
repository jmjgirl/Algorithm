class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        int count = 1;
        for(int i=0; i<food.length; i++) {
            count += food[i]%2==0 ? food[i] : food[i]-1;
        }
        //System.out.println(count);
        
        int[] arr = new int[count];
        int left = 0; 
        int right = arr.length-1;
        
        for(int i=0; i<food.length; i++) {
            int repeat = food[i] / 2;
            //System.out.println(repeat);
            if(repeat > 0) {
                for(int j=0; j<repeat; j++) {
                    System.out.println(i);
                    arr[left++] = i;
                    arr[right--] = i;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
    }
}