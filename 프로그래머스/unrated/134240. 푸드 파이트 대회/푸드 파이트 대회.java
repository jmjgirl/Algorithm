class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(Integer.toString(i).repeat(food[i] / 2));
        }
        return sb.toString() + "0" + sb.reverse().toString();
        /*
        String answer = "";
        
        int count = 1;
        for(int i=0; i<food.length; i++) {
            count += food[i]%2==0 ? food[i] : food[i]-1;
        }
        
        int[] arr = new int[count];
        int left = 0; 
        int right = arr.length-1;
        
        for(int i=0; i<food.length; i++) {
            int repeat = food[i] / 2;
 
            if(repeat > 0) {
                for(int j=0; j<repeat; j++) {
                    arr[left++] = i;
                    arr[right--] = i;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
        */
    }
}