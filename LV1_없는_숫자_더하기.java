class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i <= 9; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (i != numbers[j])
                    count++;
            }
            if (count == numbers.length)
                answer += i;
        }
        return answer;
    }
}