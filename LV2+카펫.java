import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(carpet); i++) {
            if (carpet % i == 0) {
                list1.add(i);
            }
        }
        if (Math.sqrt(carpet) % 1 == 0)
            list1.add((int) Math.sqrt(carpet));

        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                list2.add(i);
            }
        }
        if (Math.sqrt(yellow) % 1 == 0)
            list2.add((int) Math.sqrt(yellow));

        for (int i : list1) {
            for (int j : list2) {
                if (i - 2 == j && carpet / i - 2 == yellow / j) {
                    answer[0] = carpet / i;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}