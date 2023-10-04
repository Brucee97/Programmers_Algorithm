import java.util.*;

class Solution {

    public class Point {
        int x;
        int y;
        int c;

        Point(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }

    public int solution(String[] board) {
        int startx = 0, starty = 0;
        char[][] map = new char[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                map[i][j] = board[i].charAt(j);
                if (board[i].charAt(j) == 'R') {
                    startx = i;
                    starty = j;
                }
            }
        }
        return bfs(map, startx, starty);
    }

    public int bfs(char[][] map, int x, int y) {
        boolean[][] visited = new boolean[map.length][map[0].length];
        Queue<Point> root = new LinkedList<>();

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        root.add(new Point(x, y, 0));
        visited[x][y] = true;

        while (!root.isEmpty()) {
            Point now = root.poll();

            for (int i = 0; i < 4; i++) {
                int X = now.x;
                int Y = now.y;

                while (0 <= X && X < map.length && 0 <= Y && Y < map[0].length && map[X][Y] != 'D') {
                    X += dx[i];
                    Y += dy[i];
                }
                X -= dx[i];
                Y -= dy[i];

                if (!visited[X][Y]) {
                    if (map[X][Y] == 'G')
                        return now.c + 1;

                    root.add(new Point(X, Y, now.c + 1));
                    visited[X][Y] = true;
                }
            }
        }
        return -1;
    }
}