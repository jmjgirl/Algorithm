import java.io.BufferedReader;                                                                 
import java.io.IOException;                                                                    
import java.io.InputStreamReader;                                                              
import java.util.*;                                                                            
                                                                                               
                                                                                               
public class Main {                                                                            
    static int[] distance; // 거리                                                               
    static boolean[] visited; // 지나간지                                                          
    static ArrayList<Edge>[] graph; // 트리 노드 저장                                                
    public static void main(String[] args) throws IOException {                                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));              
        int V = Integer.parseInt(br.readLine()); // 노드 개수                                      
                                                                                               
        StringTokenizer st;                                                                    
                                                                                               
        graph = new ArrayList[V+1];                                                            
        for(int i=1; i<=V; i++) {                                                              
            graph[i] = new ArrayList<Edge>();                                                  
        }                                                                                      
                                                                                               
        for(int i=0; i<V; i++) {                                                               
            st = new StringTokenizer(br.readLine());                                           
            int v = Integer.parseInt(st.nextToken());                                          
            while(true) {                                                                      
                int e = Integer.parseInt(st.nextToken());                                      
                if(e==-1) break;                                                               
                int value = Integer.parseInt(st.nextToken());                                  
                graph[v].add(new Edge(e,value));                                               
            }                                                                                  
        }                                                                                      
        distance = new int[V+1];                                                               
        visited = new boolean[V+1];                                                            
        bfs(1); // 처음 부터 시작                                                                    
        int Max = 1;                                                                           
        for(int i=2; i<=V; i++) {  // distance 배열에서 가장 큰 값으로 다시 시작점 설정?? why                   
            if(distance[Max] < distance[i]) {                                                  
                Max = i;                                                                       
            }                                                                                  
        }                                                                                      
                                                                                               
        distance = new int[V+1];                                                               
        visited = new boolean[V+1];                                                            
        bfs(Max);                                                                              
        Arrays.sort(distance);                                                                 
        System.out.println(distance[V]);                                                       
    }                                                                                          
                                                                                               
    public static void bfs(int index) {                                                        
        Queue<Integer> queue = new LinkedList<>();                                             
        queue.add(index);                                                                      
        visited[index] = true;                                                                 
                                                                                               
        while(!queue.isEmpty()) {                                                              
            int now_node = queue.poll();                                                       
            for(Edge i : graph[now_node]) {                                                    
                int e = i.e;                                                                   
                int value = i.value;                                                           
                if(!visited[e]) { // 지나가지 않았으면                                                 
                    visited[e] = true;                                                         
                    distance[e] = distance[now_node] + value; // 거리 배열 업데이트                    
                    queue.add(e);                                                              
                }                                                                              
            }                                                                                  
        }                                                                                      
    }                                                                                          
}                                                                                              
                                                                                               
class Edge {                                                                                   
    int e;                                                                                     
    int value;                                                                                 
                                                                                               
    public Edge(int e, int value) {                                                            
        this.e = e;                                                                            
        this.value = value;                                                                    
    }                                                                                          
}                                                                                              