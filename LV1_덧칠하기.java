class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];

        for (int i = 0; i < n; i++) {
            wall[i] = 1;
        }
        for (int i = 0; i < section.length; i++) {
            wall[section[i] - 1] = 0;
        }

        for (int i = 0; i < wall.length; i++) {
            if (wall[i] == 0) {
                for (int j = 0; j < m; j++) {
                    if (i + j < n)
                        wall[i + j] = 1;
                }
                answer++;
            }
        }

        return answer;
    }
}