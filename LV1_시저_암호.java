class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            for (int j = 0; j < n; j++) {
                if (Character.isLowerCase(alpha) || Character.isUpperCase(alpha)) {
                    alpha++;
                    if (alpha == 123 || alpha == 91)
                        alpha -= 26;
                }
            }
            answer += alpha;
        }
        return answer;
    }
}