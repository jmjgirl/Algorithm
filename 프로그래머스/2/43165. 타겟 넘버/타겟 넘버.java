class Solution {
    public int answer;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int dept, int target, int sum) {
        if (dept == numbers.length) { // 마지막 노드까지 탐색한 경우
            if(sum == target) answer++;
        } else {
            dfs(numbers, dept+1, target, sum + numbers[dept]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, dept+1, target, sum - numbers[dept]);
        }       
    }
}