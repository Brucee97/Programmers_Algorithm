import java.util.*;

class Solution {

    public class Point {
        int x;
        int y;
        int c;

        Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.c = count;
        }
    }

    public int solution(String[] maps) {
        char[][] maze = new char[maps.length][maps[0].length()];
        int startX = 0, startY = 0, labberX = 0, labberY = 0;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = maps[i].charAt(j);

                // 출발 위치
                if (maps[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                }
                // 레버 위치
                if (maps[i].charAt(j) == 'L') {
                    labberX = i;
                    labberY = j;
                }
            }
        }

        int time1 = bfs(maze, startX, startY, 'L');
        int time2 = bfs(maze, labberX, labberY, 'E');

        if (time1 == -1 || time2 == -1)
            return -1;
        else
            return time1 + time2;
    }

    public int bfs(char[][] maze, int x, int y, char object) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int count = 0;

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point Now = q.poll();

            for (int i = 0; i < 4; i++) {
                int X = Now.x + dx[i];
                int Y = Now.y + dy[i];

                if (0 <= X && X < maze.length && 0 <= Y && Y < maze[0].length) {
                    if (!visited[X][Y] && maze[X][Y] != 'X') {
                        q.add(new Point(X, Y, Now.c + 1));
                        visited[X][Y] = true;
                        if (maze[X][Y] == object)
                            return Now.c + 1;
                    }
                }
            }
        }
        return -1;
    }
}