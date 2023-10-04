import java.util.*;

class Solution {
    public List solution(String msg) {

        List<Integer> answer = new ArrayList<>();

        String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < alpha.length; i++)
            map.put(alpha[i], i + 1);

        int site = 0;
        int idx = 27;
        while (site < msg.length()) {
            String w = "";
            while (site < msg.length()) {
                if (!map.containsKey(w + msg.charAt(site)))
                    break;
                else
                    w += msg.charAt(site);
                site++;
            }
            answer.add(map.get(w));
            if (site < msg.length()) {
                map.put(w + msg.charAt(site), idx++);
            }
        }
        return answer;
    }
}