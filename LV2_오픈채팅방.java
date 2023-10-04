import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        String command = "";
        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            if (str.length == 3)
                map.put(str[1], str[2]);
        }

        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");

            if (str[0].equals("Enter")) {
                command = map.get(str[1]) + "님이 들어왔습니다.";
                list.add(command);
            }
            if (str[0].equals("Leave")) {
                command = map.get(str[1]) + "님이 나갔습니다.";
                list.add(command);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}