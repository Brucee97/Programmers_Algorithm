import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        List<String> number_list = new ArrayList<>();

        for (String i : phone_book) {

            if (number_list.size() != 0) {
                if (i.startsWith(number_list.get(number_list.size() - 1)))
                    return false;
                number_list.add(i);
            }

            if (number_list.size() == 0)
                number_list.add(i);
        }

        return answer;
    }
}