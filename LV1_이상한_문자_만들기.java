import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0)
                    answer += arr[i].substring(j, j + 1).toUpperCase();
                else
                    answer += arr[i].substring(j, j + 1).toLowerCase();
            }
            answer += " ";
        }
        answer = answer.strip();

        return answer;
    }
}