import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : topping) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        for (int i : topping) {

            set.add(i);
            if (map.get(i) != 1) {
                map.put(i, map.get(i) - 1);
            } else
                map.remove(i);

            if (set.size() == map.size())
                answer++;
        }

        return answer;
    }
}