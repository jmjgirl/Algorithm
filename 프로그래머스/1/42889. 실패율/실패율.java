import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] count = new int[N];
        double[] failure = new double[N];

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
        /*
        int num = stages.length;
        Arrays.sort(stages);
        for(int i=0; i<stages.length; i++) {
            if(stages[i] <= N) {
                count[stages[i]-1] += 1;
            }  
        }
        
        for(int i=0; i<count.length; i++) {
            failure[i] = (double) count[i] / num;
            num -= count[i];
        }
        */
        
        /*
        for(int i=0; i<failure.length; i++) {
            hashmap.put(i+1, failure[i]);
        }
        */
        
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

        //Arrays.sort(failure);
        //System.out.println(Arrays.toString(failure));
        /*
        double[] copy = Arrays.copyOf(failure, failure.length);
        Arrays.sort(copy);
        
        for(int i=0; i<copy.length; i++) {
            for(int j=0; j<failure.length; j++) {
                if(copy[i] == failure[j]) answer[i] = j;
            }
        }
        */
        
        //return failure;
        return answer;
    }
}