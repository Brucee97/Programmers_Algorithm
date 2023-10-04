import java.util.*;

class Solution {
    public List solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < prices.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j])
                    break;
            }
            list.add(count);
        }
        list.add(0);
        return list;
    }
}