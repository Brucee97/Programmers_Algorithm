class Solution {
    public int solution(int n) {
        int answer = 0;
        String str1 = Integer.toString(n, 3);
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.substring(i, i + 1);
        }
        answer = Integer.parseInt(str2, 3);
        return answer;
    }
}