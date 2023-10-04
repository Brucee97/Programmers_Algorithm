import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();

        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i - 1] != 0) {
                    if (stack.size() == 0) {
                        stack.push(board[j][i - 1]);
                        board[j][i - 1] = 0;
                        break;
                    }
                    if (board[j][i - 1] == stack.peek()) {
                        stack.pop();
                        board[j][i - 1] = 0;
                        answer += 2;
                        break;
                    }
                    if (board[j][i - 1] != stack.peek()) {
                        stack.push(board[j][i - 1]);
                        board[j][i - 1] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}