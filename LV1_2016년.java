import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();

        if (dayOfWeekNumber == 1)
            answer += "MON";
        if (dayOfWeekNumber == 2)
            answer += "TUE";
        if (dayOfWeekNumber == 3)
            answer += "WED";
        if (dayOfWeekNumber == 4)
            answer += "THU";
        if (dayOfWeekNumber == 5)
            answer += "FRI";
        if (dayOfWeekNumber == 6)
            answer += "SAT";
        if (dayOfWeekNumber == 7)
            answer += "SUN";

        return answer;
    }
}