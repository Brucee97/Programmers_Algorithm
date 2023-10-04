import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (String str : skill_trees) {
            boolean flag = true;
            list.clear();

            for (int i = 0; i < skill.length(); i++) {
                if (list.size() == 0 && str.contains(skill.substring(i, i + 1))) {
                    list.add(str.indexOf(skill.substring(i, i + 1)));
                    continue;
                }
                if (list.size() == 0 && !str.contains(skill.substring(i, i + 1))) {
                    list.add(str.length());
                    continue;
                }
                if (list.size() != 0 && str.contains(skill.substring(i, i + 1))) {
                    list.add(str.indexOf(skill.substring(i, i + 1)));
                    if (list.get(i - 1) > list.get(i)) {
                        flag = false;
                        break;
                    }
                }
                if (list.size() != 0 && !str.contains(skill.substring(i, i + 1))) {
                    list.add(str.length());
                    if (list.get(i - 1) > list.get(i)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                answer++;
        }
        return answer;
    }
}