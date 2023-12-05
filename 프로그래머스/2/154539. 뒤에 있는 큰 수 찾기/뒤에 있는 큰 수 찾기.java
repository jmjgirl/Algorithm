import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            // 스택이 비어있지 않으면서 현재 스택이 바라보고 있는 값보다 number의 값이 크면 뒤에 있는 큰 수 해당
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        
        // 모든 index를 탐색 후 뒤에 있는 큰 수가 없는 경우 -1 
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        /*
        int index = 0;
        while(index < numbers.length) {
            for(int i=index; i<numbers.length; i++) {
                if(numbers[index] < numbers[i]) {
                    answer[index] = numbers[i];
                    break;
                }
            }
            if(answer[index] == 0) answer[index] = -1;
            index++;
        }
        */
        
        return answer;
    }
}