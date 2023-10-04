import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < discount.length - 9; i++) {

            int count = 0;
            for (int k = 0; k < want.length; k++)
                map.put(want[k], number[k]);

            for (int j = i; j < i + 10; j++) {
                if (!map.containsKey(discount[j]) || map.get(discount[j]) <= 0)
                    break;
                else {
                    count++;
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }

            if (count == 10)
                answer++;
        }

        return answer;
    }
}