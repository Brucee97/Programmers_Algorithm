import java.util.*;

class Solution {

    public class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    boolean[][] visited;

    public List solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        char[][] land = new char[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                land[i][j] = maps[i].charAt(j);
            }
        }
        visited = new boolean[land.length][land[0].length];

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (!visited[i][j] && land[i][j] != 'X') {
                    answer.add(bfs(land, i, j, 0));
                }
            }
        }

        if (answer.size() == 0)
            answer.add(-1);
        Collections.sort(answer);
        return answer;

    }

    public int bfs(char[][] land, int x, int y, int sum) {

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };
        Queue<Point> q = new LinkedList<>();

        q.add(new Point(x, y));
        sum += land[x][y] - 48;
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int X = now.x + dx[i];
                int Y = now.y + dy[i];
                if (0 <= X && X < land.length && 0 <= Y && Y < land[0].length) {
                    if (!visited[X][Y] && land[X][Y] != 'X') {
                        q.add(new Point(X, Y));
                        sum += land[X][Y] - 48;
                        visited[X][Y] = true;
                    }
                }
            }
        }
        return sum;
    }
}