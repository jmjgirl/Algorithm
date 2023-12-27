import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i=0; i<bridge_length; i++) {
            bridge.add(0);
        }
        
        int truckIdx = 0;
        int truckWeight = 0;
        while(truckIdx < truck_weights.length) {
            answer++;
            truckWeight -= bridge.poll();
            if(truckWeight + truck_weights[truckIdx] <= weight) { // 다리에 트럭을 올릴 수 있는 경우
                bridge.add(truck_weights[truckIdx]);
                truckWeight += truck_weights[truckIdx];
                truckIdx++;
            } else { // 다리에 트럭을 못올릴 경우
                bridge.add(0);
            }
        }
        
        answer += bridge_length;
        
        return answer;
    }
}