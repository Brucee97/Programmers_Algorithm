import java.util.*;

class Solution {
    public List solution(int x, int n) {
        List<Object> answer = new ArrayList<>();
        long number = 0;
        for (int i = 1; i <= n; i++) {
            number += x;
            answer.add(number);
        }
        return answer;
    }
}