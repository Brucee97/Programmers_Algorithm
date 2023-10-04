class Solution {
    public String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                answer += s.substring(i, i + 1).toUpperCase();
                continue;
            }
            if (s.substring(i - 1, i).equals(" ")) {
                answer += s.substring(i, i + 1).toUpperCase();
            } else {
                answer += s.substring(i, i + 1).toLowerCase();
            }

        }

        return answer;
    }
}