class Solution {

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        else
            return gcd(num2, num1 % num2);
    }

    public int solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i + 1] = arr[i] * arr[i + 1] / gcd(arr[i], arr[i + 1]);
                continue;
            }
            if (arr[i] < arr[i + 1]) {
                arr[i + 1] = arr[i] * arr[i + 1] / gcd(arr[i + 1], arr[i]);
                continue;
            }
        }
        return arr[arr.length - 1];
    }
}