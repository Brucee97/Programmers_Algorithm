import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; sb1.length() <= t * m; i++)
            sb1.append(Integer.toString(i, n).toUpperCase());

        for (int i = p - 1; sb2.length() < t; i += m)
            sb2.append(sb1.substring(i, i + 1));

        return sb2.toString();
    }
}