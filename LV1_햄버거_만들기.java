import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String recipe = "1231";
        StringBuffer list = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]", ""));

        while (list.indexOf(recipe) > -1) {
            int start = list.indexOf(recipe);
            list.delete(start, start + 4);
            answer++;
        }

        return answer;
    }
}