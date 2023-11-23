import java.util.*;
// DFS
class Solution {
    public List<String> list;
    public String[] words = new String[]{"A","E","I","O","U"};
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        dfs("",0);
        return list.indexOf(word);
    }
    
    public void dfs(String str, int len) {
        list.add(str);
        if(len == 5) return;
        for(int i=0; i<5; i++) {
            dfs(str+words[i], len+1);
        }
    }
}