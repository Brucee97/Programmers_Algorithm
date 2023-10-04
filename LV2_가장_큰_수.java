import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            number[i] = String.valueOf(numbers[i]);

        Arrays.sort(number, (i1, i2) -> (i2 + i1).compareTo(i1 + i2));

        if (number[0].equals("0"))
            return "0";

        StringBuilder answer = new StringBuilder();

        for (String str : number)
            answer.append(str);

        return answer.toString();
    }
}