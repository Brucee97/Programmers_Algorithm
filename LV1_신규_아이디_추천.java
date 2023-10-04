import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String answer1 = "";

        for (int i = 0; i < new_id.length(); i++) { // 1단계
            if (Character.isUpperCase(new_id.charAt(i)))
                answer += new_id.substring(i, i + 1).toLowerCase();
            else
                answer += new_id.substring(i, i + 1);
        }

        for (int i = 0; i < answer.length(); i++) { // 2단계
            if (Character.isLowerCase(answer.charAt(i)) ||
                    Character.isDigit(answer.charAt(i)) ||
                    answer.charAt(i) == '-' ||
                    answer.charAt(i) == '_' ||
                    answer.charAt(i) == '.')
                answer1 += answer.substring(i, i + 1);
        }

        while (answer1.contains("..")) // 3단계
            answer1 = answer1.replace("..", ".");

        while (answer1.startsWith(".")) { // 4단계
            if (answer1.length() == 1) {
                answer1 = "";
                continue;
            }
            answer1 = answer1.substring(1, answer1.length());
        }
        while (answer1.endsWith(".")) {
            if (answer1.length() == 1) {
                answer1 = "";
                continue;
            }
            answer1 = answer1.substring(0, answer1.length() - 1);
        }

        if (answer1.length() == 0)
            answer1 = "a"; // 5단계

        if (answer1.length() >= 16) { // 6단계
            answer1 = answer1.substring(0, 15);
            while (answer1.endsWith(".")) {
                answer1 = answer1.substring(0, answer1.length() - 1);
            }
        }

        while (answer1.length() <= 2) { // 7단계
            answer1 += answer1.substring(answer1.length() - 1, answer1.length());
        }

        return answer1;
    }
}