class Solution {
    public static int count_1(int m) {
        int count = 0;
        String number = Integer.toBinaryString(m);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1')
                count++;
        }
        return count;
    }

    public int solution(int n) {
        int answer = 0;
        int binary_count = count_1(n);
        for (int i = n + 1; true; i++) {
            if (count_1(i) == binary_count) {
                return i;
            }
        }
    }
}