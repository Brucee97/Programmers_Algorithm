import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int[] answer = new int[targets.length];
        for (String i : keymap) {
            for (int j = 0; j < i.length(); j++) {
                if (map.containsKey(i.substring(j, j + 1)) && map.get(i.substring(j, j + 1)) < j + 1)
                    continue;
                else
                    map.put(i.substring(j, j + 1), j + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (!map.containsKey(targets[i].substring(j, j + 1))) {
                    answer[i] = -1;
                    break;
                } else
                    answer[i] += map.get(targets[i].substring(j, j + 1));
            }
        }

        return answer;
    }
}