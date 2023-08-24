class Solution {
    public int solution(int balls, int share) {
        if (balls == share)
            return 1;

        // 예) 5개 중 3개를 고르는건 5C3 = 5C2
        long answer = 1;
        int num = (balls - share < share) ? balls - share : share;

        for (int i = 0; i < num; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return (int)answer;
    }
}