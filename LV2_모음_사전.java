import java.util.*;

class Solution {
    public int solution(String word) {
        String vowel = "AEIOU";
        int[] vow_length = { 781, 156, 31, 6, 1 };
        int result = word.length();
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            index = vowel.indexOf(word.charAt(i));
            result += vow_length[i] * index;
        }
        // A, AA, AAA, AAAA, AAAAA, AAAAE, AAAAI, AAAAO, AAAAU, AAAEA, AAAEE, AAAEI
        return result;
    }
}