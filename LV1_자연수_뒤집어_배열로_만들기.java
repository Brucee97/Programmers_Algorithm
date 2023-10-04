import java.util.*;

class Solution {
    public List solution(long n) {
        String number = Long.toString(n);
        String[] arr = new String[number.length()];
        arr = number.split("");
        List<Integer> answer = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            answer.add(Integer.parseInt(arr[i]));
        }

        return answer;
    }
}