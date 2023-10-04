import java.util.*;

class Solution {
    public String[] solution(String[] files) {

        String[][] Head_Number = new String[files.length][3];
        for (int i = 0; i < files.length; i++) {
            boolean check = true;
            int StartIdx = 0, EndIdx = files[i].length();
            for (int j = 0; j < files[i].length(); j++) {
                if (check) {
                    if (Character.isDigit(files[i].charAt(j))) {
                        check = false;
                        StartIdx = j;
                        continue;
                    }
                }
                if (!check) {
                    if (!Character.isDigit(files[i].charAt(j))) {
                        EndIdx = j;
                        break;
                    }
                }
            }
            Head_Number[i][0] = files[i].substring(0, StartIdx);
            Head_Number[i][1] = files[i].substring(StartIdx, EndIdx);
            Head_Number[i][2] = files[i].substring(EndIdx, files[i].length());
        }

        // Lamda 정렬
        Arrays.sort(Head_Number, (s1, s2) -> {
            if (s1[0].toUpperCase().equals(s2[0].toUpperCase()))
                return Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
            else
                return s1[0].toUpperCase().compareTo(s2[0].toUpperCase());
        });

        String[] answer = new String[Head_Number.length];
        for (int i = 0; i < Head_Number.length; i++) {
            answer[i] = Head_Number[i][0] + Head_Number[i][1] + Head_Number[i][2];
        }

        return answer;
    }
}