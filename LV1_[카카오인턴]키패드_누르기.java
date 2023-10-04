class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                numbers[i] = 11;
        }
        int[] left = { 3, 0 };
        int[] right = { 3, 2 };

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left[0] = (numbers[i] - 1) / 3;
                left[1] = 0;
                continue;
            }

            if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right[0] = (numbers[i] - 1) / 3;
                right[1] = 2;
                continue;
            }

            if (Math.abs((numbers[i] - 1) / 3 - left[0])
                    + Math.abs(1 - left[1]) < Math.abs((numbers[i] - 1) / 3 - right[0]) + Math.abs(1 - right[1])) {
                answer += "L";
                left[0] = (numbers[i] - 1) / 3;
                left[1] = 1;
                continue;
            }
            if (Math.abs((numbers[i] - 1) / 3 - left[0])
                    + Math.abs(1 - left[1]) > Math.abs((numbers[i] - 1) / 3 - right[0]) + Math.abs(1 - right[1])) {
                answer += "R";
                right[0] = (numbers[i] - 1) / 3;
                right[1] = 1;
                continue;
            }
            if (Math.abs((numbers[i] - 1) / 3 - left[0])
                    + Math.abs(1 - left[1]) == Math.abs((numbers[i] - 1) / 3 - right[0]) + Math.abs(1 - right[1]) &&
                    hand.equals("left")) {
                answer += "L";
                left[0] = (numbers[i] - 1) / 3;
                left[1] = 1;
                continue;
            }
            if (Math.abs((numbers[i] - 1) / 3 - left[0])
                    + Math.abs(1 - left[1]) == Math.abs((numbers[i] - 1) / 3 - right[0]) + Math.abs(1 - right[1]) &&
                    hand.equals("right")) {
                answer += "R";
                right[0] = (numbers[i] - 1) / 3;
                right[1] = 1;
                continue;
            }
        }

        return answer;
    }
}