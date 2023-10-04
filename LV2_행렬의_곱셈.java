class Solution {

    public static int number(int[] arr_1, int arr_2[]) {
        int answer = 0;
        for (int i = 0; i < arr_1.length; i++) {
            answer += arr_1[i] * arr_2[i];
        }
        return answer;
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int[][] arr2_change = new int[arr2[0].length][arr2.length];
        for (int i = 0; i < arr2_change.length; i++) {
            for (int j = 0; j < arr2_change[0].length; j++) {
                arr2_change[i][j] = arr2[j][i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2_change.length; j++) {
                answer[i][j] = number(arr1[i], arr2_change[j]);
            }
        }
        return answer;
    }
}