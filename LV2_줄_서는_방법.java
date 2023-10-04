import java.util.*;

class Solution {

    public int[] solution(int n, long k) {
        List<Integer> number = new ArrayList<>();
        int[] answer = new int[n];
        long f = 1;
        for (int i = 1; i <= n; i++) {
            number.add(i);
            f *= i;
        }

        k--;

        int idx = 0;

        while (idx < n) {
            f /= n - idx;
            answer[idx++] = number.remove((int) (k / f));
            k %= f;
        }
        return answer;
    }
}