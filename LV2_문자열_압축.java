class Solution {
    public int solution(String s) {
        int minimum = s.length();
        int count = 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder result = new StringBuilder();
            String base = s.substring(0, i);

            for (int j = i; j <= s.length(); j += i) {
                int EndIdx = Math.min(j + i, s.length());
                String compare = s.substring(j, EndIdx);

                if (base.equals(compare)) {
                    count++;
                } else {
                    if (count >= 2) {
                        result.append(count);
                    }
                    result.append(base);
                    base = compare;
                    count = 1;
                }
            }
            result.append(base);
            minimum = Math.min(minimum, result.length());
        }
        return minimum;
    }
}