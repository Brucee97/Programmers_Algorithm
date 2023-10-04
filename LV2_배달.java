import java.util.*;
import java.io.*;

class Solution {

    static class Point {
        int v;
        int dis;

        Point(int v, int dis) {
            this.v = v;
            this.dis = dis;
        }
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        boolean[] visited = new boolean[N];
        int[] distance = new int[N];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        Queue<Point> q = new PriorityQueue<>((o1, o2) -> o1.dis - o2.dis);
        q.add(new Point(1, 0));
        distance[0] = 0;

        while (!q.isEmpty()) {
            Point now = q.poll();

            if (!visited[now.v - 1])
                visited[now.v - 1] = true;

            for (int i = 0; i < road.length; i++) {
                if (now.v == road[i][0] && !visited[road[i][1] - 1]) {
                    if (distance[road[i][1] - 1] > now.dis + road[i][2]) {
                        distance[road[i][1] - 1] = now.dis + road[i][2];
                        q.add(new Point(road[i][1], distance[road[i][1] - 1]));
                    }
                }
                if (now.v == road[i][1] && !visited[road[i][0] - 1]) {
                    if (distance[road[i][0] - 1] > now.dis + road[i][2]) {
                        distance[road[i][0] - 1] = now.dis + road[i][2];
                        q.add(new Point(road[i][0], distance[road[i][0] - 1]));
                    }
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] <= K)
                answer++;
        }
        return answer;
    }
}