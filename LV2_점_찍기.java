class Solution {
    public long solution(int k, int d) {
        long answer = 1 + 2 * (d / k);

        double pow = Math.pow(d, 2);
        for (int a = k; a <= d; a += k) {
            answer += (int) Math.sqrt(pow - Math.pow(a, 2)) / k;
        }
        return answer;
    }
}