class Solution {
    public String solution(int[] food) {
        String answer = "";
        answer += "0";

        for (int i = food.length - 1; i > 0; i--) {
            while (food[i] / 2 >= 1) {
                answer = Integer.toString(i) + answer + Integer.toString(i);
                food[i] -= 2;
            }
        }
        return answer;
    }
}