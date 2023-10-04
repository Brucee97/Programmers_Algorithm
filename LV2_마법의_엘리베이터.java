import java.util.*;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        String str = Integer.toString(storey);
        for (int i = str.length() - 1; i >= 0; i--)
            list.add(Integer.parseInt(str.substring(i, i + 1)));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0 && list.get(i) <= 4) {
                answer += list.get(i);
                continue;
            }
            if (list.get(i) == 5) {
                if (i != list.size() - 1) {
                    if (list.get(i + 1) <= 4)
                        answer += list.get(i);
                    else {
                        answer += 10 - list.get(i);
                        list.set(i + 1, list.get(i + 1) + 1);
                    }
                } else {
                    answer += list.get(i);
                }
            }
            if (list.get(i) >= 6) {
                answer += 10 - list.get(i);
                if (i != list.size() - 1)
                    list.set(i + 1, list.get(i + 1) + 1);
                else
                    answer++;
            }
        }
        return answer;
    }
}