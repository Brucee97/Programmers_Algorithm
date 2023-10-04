class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        String[] first_arr = new String[n];
        String[] second_arr = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = "";
        }

        for (int i = 0; i < n; i++) {
            first_arr[i] = Integer.toBinaryString(arr1[i]);
            second_arr[i] = Integer.toBinaryString(arr2[i]);

            while (first_arr[i].length() < n) {
                first_arr[i] = "0" + first_arr[i];
            }
            while (second_arr[i].length() < n) {
                second_arr[i] = "0" + second_arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (first_arr[i].substring(j, j + 1).equals("0") && second_arr[i].substring(j, j + 1).equals("0"))
                    answer[i] += " ";
                else
                    answer[i] += "#";
            }
        }

        return answer;
    }
}