class Solution {
    public String solution(int num) {
        String answer = "";
        if (num == 0)
            return "Even";
        else if (num % 2 != 0)
            answer = "Odd";
        else if (num % 2 == 0)
            answer = "Even";

        return answer;
    }
}