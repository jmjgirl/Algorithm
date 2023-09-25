class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        String[] arr = new String[t.length()-p.length()+1];
        for(int i=0; i<arr.length; i++) {
            String s = t;
            arr[i] = s.substring(i,i+p.length());
            
            if(Long.parseLong(arr[i]) <= Long.parseLong(p)) answer+=1;
        }
        
        
        return answer;
    }
}