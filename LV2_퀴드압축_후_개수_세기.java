class Solution {

    int count0 = 0;
    int count1 = 0;

    public int[] solution(int[][] arr) {
        int[] answer = { 0, 0 };
        quad(arr, 0, arr.length - 1, 0, arr[0].length - 1);
        answer[0] = count0;
        answer[1] = count1;
        return answer;
    }

    public void quad(int[][] arr1, int start_x, int end_x, int start_y, int end_y) {
        boolean check = true;

        loop: for (int i = start_x; i <= end_x; i++) {
            for (int j = start_y; j <= end_y; j++) {
                if (arr1[start_x][start_y] != arr1[i][j]) {
                    check = false;
                    break loop;
                }
            }
        }

        if (check) {
            if (arr1[start_x][start_y] == 0)
                count0++;
            if (arr1[start_x][start_y] == 1)
                count1++;
        } else {
            quad(arr1, start_x, (start_x + end_x) / 2, start_y, (start_y + end_y) / 2);
            quad(arr1, start_x, (start_x + end_x) / 2, (start_y + end_y) / 2 + 1, end_y);
            quad(arr1, (start_x + end_x) / 2 + 1, end_x, start_y, (start_y + end_y) / 2);
            quad(arr1, (start_x + end_x) / 2 + 1, end_x, (start_y + end_y) / 2 + 1, end_y);
        }
    }
}