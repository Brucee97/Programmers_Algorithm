import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);
        int length = p.length();
        StringBuffer compare = new StringBuffer(t);
        for (int i = 0; i < compare.length() - length + 1; i++) {
            if (Long.parseLong(compare.substring(i, i + length)) <= number)
                answer++;
        }

        return answer;
    }
}