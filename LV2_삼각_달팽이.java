import java.util.*;

class Solution {

    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int[] dx = { 1, 0, -1 };
        int[] dy = { 0, 1, -1 };
        int[][] arr = new int[n][n];
        int d = 0, X = 0, Y = 0;
        int total = 0;
        for (int i = 1; i <= n; i++)
            total += i;

        for (int i = 1; i <= total; i++) {
            arr[X][Y] = i;

            if (X + dx[d % 3] < 0 || X + dx[d % 3] >= n || Y + dy[d % 3] < 0 || Y + dy[d % 3] >= n)
                d++;
            else if (arr[X + dx[d % 3]][Y + dy[d % 3]] != 0)
                d++;

            X += dx[d % 3];
            Y += dy[d % 3];

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0)
                    answer.add(arr[i][j]);
            }
        }
        return answer;
    }
}