class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        long pay = 0;

        for (int i = 1; i <= count; i++) {
            pay += price * i;
        }

        if (pay > money)
            return pay - money;

        return answer;
    }
}