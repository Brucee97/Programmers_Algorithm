import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i])
                continue;
            else
                answer.add(arr[i]);
        }

        if (answer.size() == 0)
            answer.add(-1);

        return answer;
    }
}