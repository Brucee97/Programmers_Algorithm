import java.util.*;

class Solution {
    public List solution(String s) {
        List<Integer> list = new ArrayList<>();
        s = s.substring(2, s.length() - 2);
        String[] arr = s.split("\\}\\,\\{");
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());
        list.add(Integer.parseInt(arr[0]));

        for (String str : arr) {
            String[] arr1 = str.split("\\,");
            for (String str1 : arr1) {
                if (!list.contains(Integer.parseInt(str1))) {
                    list.add(Integer.parseInt(str1));
                }
            }
        }
        return list;
    }
}