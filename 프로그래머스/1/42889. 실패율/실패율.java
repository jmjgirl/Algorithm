import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] answer = new int[N];
        double[] tempArr = new double[N];
        int arrLength = stages.length;
        int idx = arrLength;
        double tempD = 0;
        int tempI = 0;
        for (int i = 0; i < arrLength; i++) {
            int stage = stages[i];
            if (stage != N + 1)
                answer[stage - 1] += 1;
        }
        for (int i = 0; i < N; i++) {
            int personNum = answer[i];
            tempArr[i] = (double) personNum / idx;
            idx -= personNum;
            answer[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                if (tempArr[j - 1] < tempArr[j]) {
                    tempD = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = tempD;

                    tempI = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tempI;
                }
            }
        }
        /*
        int[] answer = new int[N];
        
        double[] pass = new double[N];
        double[] remain = new double[N];
        
        HashMap<Integer,Double> hashmap = new HashMap();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i+1) {
                    pass[i]++;
                    if (stages[j] == i+1) {
                        remain[i]++;
                    }
                }
            }
            if (pass[i] == 0) {
                pass[i] = 1;
            }
            hashmap.put(i+1, (remain[i]/pass[i]));
        }
        
        for (int i = 0; i < N; i++) {
            double max = -1;
            int index = 0;
            for (int key : hashmap.keySet()) {
                if (hashmap.get(key) > max) {
                    max = hashmap.get(key);
                    index = key;
                }
            }
            answer[i] = index;
            hashmap.remove(index);
        }
        */
        
        return answer;
    }
}