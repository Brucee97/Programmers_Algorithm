import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> mix = new PriorityQueue<>();
        for (int i : scoville)
            mix.add(i);

        while (mix.peek() < K) {
            if (mix.size() < 2)
                return -1;
            int num1 = mix.poll();
            int num2 = mix.poll();

            mix.add(num1 + num2 * 2);
            answer++;
        }
        return answer;
    }
}