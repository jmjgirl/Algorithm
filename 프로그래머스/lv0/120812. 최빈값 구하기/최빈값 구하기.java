class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int countMax = 0;
        int arrayMax = 0; //배열의 최대값
    
        
        // 1. 배열의 최대값을 구함
        for (int i=0; i<array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        
        int [] arr = new int[arrayMax+1];
        
        // 2. 배열에 들어있는 수에 +1
        for (int j=0; j<array.length; j++) {
            arr[array[j]]++;
        }
        
        // 3. 새로 만든 배열의 최대값을 구함
        for (int k=0; k<arr.length; k++) {
            if (countMax < arr[k]) {
                countMax = arr[k];
                answer = k;
            }
        }
        
        int count = 0;
        // 4. k가 여러개인지 확인
        for (int j=0; j<arr.length; j++) {
            if (arr[j]==countMax) {
                count++;
            }
        }
        
        // 5. 만약 1이면 answer을 return, 1보다 크면 최빈값이 여러개이므로 -1 return
        if (count > 1) {
            return -1;
        } 
        
        return answer;
        
    }
}