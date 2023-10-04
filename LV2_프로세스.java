import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Integer[] process1 = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Arrays.sort(process1, Collections.reverseOrder());
        Queue<Integer> process = new LinkedList<>();
        for (int i : process1)
            process.add(i);

        while (!process.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == process.peek()) {
                    if (i == location)
                        return answer + 1;
                    process.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}