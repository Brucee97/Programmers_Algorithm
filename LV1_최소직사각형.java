class Solution {
    public int solution(int[][] sizes) {
        int max_x = 0, max_y = 0;

        // 배열 정렬
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            if (max_x < sizes[i][0])
                max_x = sizes[i][0];
            if (max_y < sizes[i][1])
                max_y = sizes[i][1];
        }

        return max_x * max_y;
    }
}