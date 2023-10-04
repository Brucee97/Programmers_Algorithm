import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        int[][] graph = new int[n + 1][n + 1];

        for (int i = 0; i < wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 0;
            graph[wires[i][1]][wires[i][0]] = 0;

            int result = bfs(graph, wires[i][0], n);
            answer = Math.min(answer, result);

            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }
        return answer;
    }

    public int bfs(int[][] graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        int count = 1;
        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 0; i < graph.length; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return Math.abs(count - (graph.length - 1 - count));
    }
}