import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[][] change_type = new int[book_time.length][book_time[0].length];

        for (int i = 0; i < book_time.length; i++) {
            int s = Integer.parseInt(book_time[i][0].substring(0, 2)) * 60
                    + Integer.parseInt(book_time[i][0].substring(3, 5));
            int e = Integer.parseInt(book_time[i][1].substring(0, 2)) * 60
                    + Integer.parseInt(book_time[i][1].substring(3, 5)) + 10;

            change_type[i][0] = s;
            change_type[i][1] = e;
        }
        Arrays.sort(change_type, (i1, i2) -> i1[0] - i2[0]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < change_type.length; i++) {
            int start = change_type[i][0];
            int end = change_type[i][1];
            if (list.size() == 0) {
                list.add(end);
                continue;
            }

            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) <= start) {
                    list.set(j, end);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(end);
                continue;
            }
        }
        return list.size();
    }
}