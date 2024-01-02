import java.util.*;
class Solution {
    public boolean[] visited;
    public HashMap<String,Integer> map;
    public String[] solution(String[] orders, int[] course) {
        map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        int[] list = new int[course.length];
        
        // 1. 각 Order 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] c = orders[i].toCharArray();
            Arrays.sort(c);
            orders[i] = String.valueOf(c);
        }
        
        // DFS
        for(int i=0; i<orders.length; i++) {
            visited = new boolean[orders[i].length()];
            dfs(orders[i], "", 0, 0);
        }
        

        int count = 0;
        for(int i=0; i<course.length; i++) {
            int max = 0;
            for(String key : map.keySet()) {
                int num = map.get(key);
                if(key.length() == course[i] && max <= num) {
                    max = num;
                }
            }
            if(max >= 2) {
                list[i] = max;
            }
        }

        for(int i=0; i<course.length; i++) {
            for(String key : map.keySet()) {
                int num = map.get(key);
                if(key.length() == course[i] && num == list[i]) {
                    arr.add(key);
                    count++;

                }
            }
        }

        Collections.sort(arr);
        String[] answer = new String[count];
        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        
        return answer;
    }
    
    public void dfs(String order, String str, int dept, int index) {
        if(dept == order.length()) return ;
        for(int i=index; i<order.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(order, str + order.charAt(i), dept+1, i+1);
                map.put(str + order.charAt(i), map.getOrDefault(str + order.charAt(i),0)+1);
                visited[i] = false;
            }
        }
    }
}