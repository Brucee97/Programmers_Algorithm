class Solution {
    public int solution(String dartResult) {
        String num = "";
        int[] score = new int[3];
        int n = 0, site = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (ch >= '0' && ch <= '9')
                num += String.valueOf(ch);

            if (ch == 'S' || ch == 'D' || ch == 'T') {
                n = Integer.parseInt(num);
                if (ch == 'S')
                    score[site] += (int) Math.pow(n, 1);
                if (ch == 'D')
                    score[site] += (int) Math.pow(n, 2);
                if (ch == 'T')
                    score[site] += (int) Math.pow(n, 3);
                num = "";
                site++;
            }

            if (ch == '#' || ch == '*') {
                if (ch == '*') {
                    score[site - 1] *= 2;
                    if (site > 1)
                        score[site - 2] *= 2;
                }
                if (ch == '#')
                    score[site - 1] *= -1;
            }
        }
        int answer = score[0] + score[1] + score[2];

        return answer;
    }
}