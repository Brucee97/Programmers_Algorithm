import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        List<String> card1 = new ArrayList<>();
        for (String i : cards1) {
            card1.add(i);
        }

        List<String> card2 = new ArrayList<>();
        for (String i : cards2) {
            card2.add(i);
        }

        for (String i : goal) {
            if (card1.size() != 0 && card1.get(0).equals(i)) {
                card1.remove(0);
                continue;
            } else if (card2.size() != 0 && card2.get(0).equals(i)) {
                card2.remove(0);
                continue;
            } else
                return "No";
        }

        return answer;
    }
}