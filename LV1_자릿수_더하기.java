import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n);
        String[] arr = new String[number.length()];
        arr = number.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}