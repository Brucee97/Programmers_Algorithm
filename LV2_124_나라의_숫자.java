class Solution {
    public String solution(int n) {
        String[] country = { "4", "1", "2" };
        String answer = "";

        while (n > 0) {
            int number = n % 3;
            n = n / 3;

            if (number == 0)
                n--;

            answer = country[number] + answer;
        }
        return answer;
    }
}