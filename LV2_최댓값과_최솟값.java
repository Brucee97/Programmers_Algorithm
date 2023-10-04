import java.util.*;

class Solution {
    public String solution(String s) {
        String[] first = s.split(" ");
        int[] second = new int[first.length];
        for (int i = 0; i < second.length; i++) {
            second[i] = Integer.parseInt(first[i]);
        }
        Arrays.sort(second);
        String answer = second[0] + " " + second[second.length - 1];
        return answer;
    }
}