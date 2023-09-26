class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        
        // 1. 지도를 2진수 배열로 바꿈
        for(int i=0; i<n; i++) {
            binaryArr1[i] = Integer.toBinaryString(arr1[i]).length() < n ? "0".repeat(n-Integer.toBinaryString(arr1[i]).length()) + Integer.toBinaryString(arr1[i]) : Integer.toBinaryString(arr1[i]);
            
            binaryArr2[i] = Integer.toBinaryString(arr2[i]).length() < n ? "0".repeat(n-Integer.toBinaryString(arr2[i]).length()) + Integer.toBinaryString(arr2[i]) : Integer.toBinaryString(arr2[i]);

        }
        
        String str = "";
        // 2. 전체지도 만들기
        for(int j=0; j<n; j++) {
            String [] split1 = binaryArr1[j].split("");
            String [] split2 = binaryArr2[j].split("");
            
            for(int k=0; k<n; k++) {
                if(split1[k].equals("1") || split2[k].equals("1")) {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            
            answer[j] = str;
            str = "";
        }
        
        
        return answer;
    }
}