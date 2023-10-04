import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>(values);
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            k -= list.get(i);
            if (k <= 0)
                return list.size() - i;
        }

        return answer;
    }
}