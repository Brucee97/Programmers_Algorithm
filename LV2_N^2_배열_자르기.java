import java.util.*;

class Solution {
    public List solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();
        // 시작 행렬 ? -> (left/n, left%n)
        // 종료 행렬 ? -> (right/n, right%n)
        for (long l = left; l <= right; l++) {
            if (l / (long) n >= l % (long) n)
                answer.add(l / (long) n + 1);
            else
                answer.add(l % (long) n + 1);
        }
        return answer;
    }
}