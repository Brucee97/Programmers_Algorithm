import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int[] element = new int[elements.length * 2];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            element[i] = elements[i];
            element[i + elements.length] = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += element[i + j];
                set.add(sum);
            }
        }

        return set.size();
    }
}