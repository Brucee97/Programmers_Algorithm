import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 5, y = 5;
        boolean[][] check_x = new boolean[11][10];
        boolean[][] check_y = new boolean[10][11];

        for (char c : dirs.toCharArray()) {
            if (c == 'U') {
                if (y == 0)
                    continue;
                if (!check_y[y - 1][x]) {
                    answer++;
                    check_y[y - 1][x] = true;
                }
                y--;
                continue;
            }

            if (c == 'D') {
                if (y == 10)
                    continue;
                if (!check_y[y][x]) {
                    answer++;
                    check_y[y][x] = true;
                }
                y++;
                continue;
            }

            if (c == 'L') {
                if (x == 0)
                    continue;
                if (!check_x[y][x - 1]) {
                    answer++;
                    check_x[y][x - 1] = true;
                }
                x--;
                continue;
            }

            if (c == 'R') {
                if (x == 10)
                    continue;
                if (!check_x[y][x]) {
                    answer++;
                    check_x[y][x] = true;
                }
                x++;
                continue;
            }
        }
        return answer;
    }
}