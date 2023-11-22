class Solution {
    public int answer;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int dept, int target, int sum) {
        if(dept == numbers.length) {
            if(target == sum) answer++;
        } else {
            dfs(numbers, dept+1, target, sum + numbers[dept]);
            dfs(numbers, dept+1, target, sum - numbers[dept]);
        }
    }
    
    
}