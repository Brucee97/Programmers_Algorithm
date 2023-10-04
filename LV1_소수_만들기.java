class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(sum))
                        answer++;
                }
            }
        }
        return answer;
    }

    public static boolean isPrimeNumber(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                flag = false;
        }
        return flag;
    }
}