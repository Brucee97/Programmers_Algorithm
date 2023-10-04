class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int count_p = 0;
        int count_y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("p"))
                count_p++;
            if (s.substring(i, i + 1).equals("y"))
                count_y++;
        }

        if (count_p != count_y)
            answer = false;

        return answer;
    }
}