class Solution {

    public static boolean isPrime(long num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n, int k) {

        int answer = 0;
        String numstr = Integer.toString(n, k);
        String[] str = numstr.split("0");

        for (String s : str) {
            if (s.equals(""))
                continue;
            long number = Long.parseLong(s);
            if (isPrime(number)) {
                answer++;
            }
        }
        return answer;
    }
}