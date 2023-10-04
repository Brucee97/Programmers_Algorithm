import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0)
                days[i]++;
        }

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= days[i - 1]) {
                int temp = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(temp + 1);
                days[i] = days[i - 1];
            } else {
                list.add(1);
            }
        }

        return list;
    }
}