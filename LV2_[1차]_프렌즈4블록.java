class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] block = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                block[i][j] = board[m - 1 - j].charAt(i);
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            boolean[][] check = new boolean[block.length][block[0].length];

            for (int i = 0; i < block.length - 1; i++) {
                for (int j = 0; j < block[i].length - 1; j++) {
                    char ch = block[i][j];
                    if (ch != '#' && ch == block[i][j + 1] && ch == block[i + 1][j] && ch == block[i + 1][j + 1]) {
                        check[i][j] = true;
                        check[i][j + 1] = true;
                        check[i + 1][j] = true;
                        check[i + 1][j + 1] = true;
                        flag = true;
                    }
                }
            }

            if (flag) {
                for (int i = 0; i < check.length; i++) {
                    for (int j = 0; j < check[i].length; j++) {
                        if (check[i][j]) {
                            block[i][j] = '#';
                            answer++;
                        }
                    }
                }
            }

            if (flag) {
                for (int i = 0; i < block.length; i++) {
                    String str = "";
                    int count = 0;
                    for (int j = 0; j < block[i].length; j++) {
                        if (block[i][j] != '#') {
                            str += block[i][j];
                            continue;
                        }
                        if (block[i][j] == '#') {
                            count++;
                            continue;
                        }
                    }
                    for (int j = 0; j < str.length(); j++) {
                        block[i][j] = str.charAt(j);
                    }
                    for (int j = block[i].length - 1; j >= str.length(); j--) {
                        block[i][j] = '#';
                    }
                }
            }
        }
        return answer;
    }
}