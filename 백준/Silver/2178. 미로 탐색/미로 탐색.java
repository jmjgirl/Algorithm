import java.io.BufferedReader;                                                             
import java.io.IOException;                                                                
import java.io.InputStreamReader;                                                          
import java.util.*;                                                                        
                                                                                           
                                                                                           
public class Main {                                                                        
    static int[][] visited;                                                                
    static int[][] map;                                                                    
    static int N;                                                                          
    static int M;                                                                          
    public static void main(String[] args) throws IOException {                            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
        StringTokenizer st = new StringTokenizer(br.readLine());                           
        N = Integer.parseInt(st.nextToken());                                              
        M = Integer.parseInt(st.nextToken());                                              
        visited = new int[N][M]; // count                                                  
        map = new int[N][M];                                                               
                                                                                           
        for(int i=0; i<N; i++) {                                                           
            String str = br.readLine();                                                    
            for(int j=0; j<M; j++) {                                                       
                int num = str.charAt(j) - '0';                                             
                map[i][j] = num;                                                           
            }                                                                              
        }                                                                                  
        bfs(0,0);                                                                          
        System.out.println(visited[N-1][M-1]);                                             
                                                                                           
    }                                                                                      
                                                                                           
    public static void bfs(int s, int e) {                                                 
        int[] dx = {0,0,1,-1};                                                             
        int[] dy = {-1,1,0,0};                                                             
                                                                                           
        Queue<int[]> queue = new LinkedList<>();                                           
        queue.add(new int[]{s,e});                                                         
        visited[s][e] = 1;                                                                 
                                                                                           
        while(!queue.isEmpty()) {                                                          
            int[] arr = queue.poll();                                                      
            int currentX = arr[0];                                                         
            int currentY = arr[1];                                                         
                                                                                           
            // 옆으로 한칸씩                                                                     
            for(int i=0; i<4; i++) {                                                       
                int moveX = currentX + dx[i];                                              
                int moveY = currentY + dy[i];                                              
                                                                                           
                if(moveX < 0 || moveX >= N || moveY < 0 || moveY >= M) continue;           
                                                                                           
                if(map[moveX][moveY] == 1 && visited[moveX][moveY] == 0) { // 가본적없는곳       
                    visited[moveX][moveY] = visited[currentX][currentY]+1;                 
                    queue.add(new int[]{moveX,moveY});                                     
                }                                                                          
            }                                                                              
        }                                                                                  
    }                                                                                      
}                                                                                          