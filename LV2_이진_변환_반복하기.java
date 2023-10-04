class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int number = 0, count1 = 0, count2 = 0;

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++)
                if (s.substring(i, i + 1).equals("0"))
                    count2++;

            s = s.replaceAll("0", "");
            number = s.length();
            s = Integer.toString(number, 2);

            count1++;
        }
        answer[0] = count1;
        answer[1] = count2;

        return answer;
    }
}