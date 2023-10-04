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

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            char[][] place = new char[5][5];
            List<Point> list = new ArrayList<>();

            for (int j = 0; j < places[0].length; j++) {
                for (int k = 0; k < 5; k++) {
                    place[j][k] = places[i][j].charAt(k);
                    if (place[j][k] == 'P')
                        list.add(new Point(j, k, 0));
                }
            }

            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (bfs(place, list.get(j).x, list.get(j).y) == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                answer[i] = 1;
            else
                answer[i] = 0;

        }

        return answer;

    }

    public int bfs(char[][] place, int x, int y) {
        boolean[][] visited = new boolean[place.length][place[0].length];
        Queue<Point> q = new LinkedList<>();

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        q.add(new Point(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int X = now.x + dx[i];
                int Y = now.y + dy[i];

                if (0 <= X && X < 5 && 0 <= Y && Y < 5) {
                    if (!visited[X][Y] && place[X][Y] != 'X' && now.c < 2) {
                        if (place[X][Y] == 'P')
                            return 0;
                        q.add(new Point(X, Y, now.c + 1));
                        visited[X][Y] = true;
                    }
                }
            }
        }

        return 1;
    }
}