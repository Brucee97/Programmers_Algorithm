import java.util.*;

class Solution {

    List<Integer> answer = new ArrayList<>();

    public List solution(int rows, int columns, int[][] queries) {

        int[][] arr = new int[rows][columns];
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = number;
                number++;
            }
        }

        // 배열 회전
        for (int j = 0; j < queries.length; j++) {
            int x1 = queries[j][0] - 1;
            int x2 = queries[j][2] - 1;
            int y1 = queries[j][1] - 1;
            int y2 = queries[j][3] - 1;

            int keep = arr[x1][y2];
            int min = arr[x1][y2];

            for (int i = y2; i > y1; i--) {
                arr[x1][i] = arr[x1][i - 1];
                if (min > arr[x1][i])
                    min = arr[x1][i];
            }

            for (int i = x1; i < x2; i++) {
                arr[i][y1] = arr[i + 1][y1];
                if (min > arr[i][y1])
                    min = arr[i][y1];
            }

            for (int i = y1; i < y2; i++) {
                arr[x2][i] = arr[x2][i + 1];
                if (min > arr[x2][i])
                    min = arr[x2][i];
            }

            for (int i = x2; i > x1; i--) {
                arr[i][y2] = arr[i - 1][y2];
                if (min > arr[i][y2])
                    min = arr[i][y2];
            }

            arr[x1 + 1][y2] = keep;
            answer.add(min);

        }
        return answer;
    }
}