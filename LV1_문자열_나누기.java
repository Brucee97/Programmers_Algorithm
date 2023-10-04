class Solution {
    public int solution(String s) {

        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ch)
                count1++;
            if (s.charAt(i) != ch)
                count2++;
            if (count1 == count2) {
                answer++;
                count1 = 0;
                count2 = 0;
                if (i == s.length() - 1)
                    break;
                if (i < s.length() - 1)
                    ch = s.charAt(i + 1);
            }
        }
        if (count1 != 0 || count2 != 0)
            answer++;
        return answer;
    }
}