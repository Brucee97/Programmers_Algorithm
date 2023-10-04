import java.util.*;

class Solution {

    public int solution(int[] cards) {
        boolean[] check = new boolean[cards.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < cards.length; i++) {
            if (!check[i]) {
                int idx = i;
                int count = 0;

                while (true) {
                    if (check[idx]) {
                        break;
                    }
                    if (!check[idx]) {
                        check[idx] = true;
                        idx = cards[idx] - 1;
                        count++;
                        continue;
                    }
                }
                list.add(count);
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        if (list.size() <= 1)
            return 0;
        else
            return list.get(0) * list.get(1);
    }
}