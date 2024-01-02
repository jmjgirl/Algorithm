import java.util.*;
class Solution {
    public boolean[] visited;
    public HashMap<String,Integer> map;
    public String[] solution(String[] orders, int[] course) {
        map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        int[] list = new int[course.length];
        
        // Orders에 있는 요소들을 오름차순 정렬
        for (int i=0; i<orders.length; i++) {
            char[] c = orders[i].toCharArray();
            Arrays.sort(c);
            orders[i] = String.valueOf(c);
        }
        
        // DFS를 사용하여 조합들을 map에 저장
        for(int i=0; i<orders.length; i++) {
            visited = new boolean[orders[i].length()];
            dfs(orders[i], "", 0, 0);
        }
        
        
        // 각 course에 담긴 갯수별로 최대 주문 수 찾기
        for(int i=0; i<course.length; i++) {
            int max = 0;
            for(String key : map.keySet()) {
                int num = map.get(key);
                if(key.length() == course[i] && max <= num) {
                    max = num;
                }
            }
            if(max >= 2) list[i] = max;
        }

        // 최대 주문 수를 이용해 key 값 찾아 arr에 저장
        for(int i=0; i<course.length; i++) {
            for(String key : map.keySet()) {
                int num = map.get(key);
                if(key.length() == course[i] && num == list[i]) {
                    arr.add(key);
                }
            }
        }

        // 정렬 한 후 answer 배열에 담기
        Collections.sort(arr);
        String[] answer = new String[arr.size()];
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