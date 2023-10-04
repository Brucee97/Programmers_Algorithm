import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String number = Long.toString(n);
        String[] arr = new String[number.length()];
        arr = number.split("");
        Arrays.sort(arr);
        number = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            number += arr[i];
        }
        answer = Long.parseLong(number);
        return answer;
    }
}