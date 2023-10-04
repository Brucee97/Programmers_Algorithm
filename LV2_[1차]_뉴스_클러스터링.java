import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            if (Character.isLowerCase(str1.charAt(i)) || Character.isUpperCase(str1.charAt(i))) {
                if (Character.isLowerCase(str1.charAt(i + 1)) || Character.isUpperCase(str1.charAt(i + 1)))
                    list1.add(str1.substring(i, i + 2).toUpperCase());
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (Character.isLowerCase(str2.charAt(i)) || Character.isUpperCase(str2.charAt(i))) {
                if (Character.isLowerCase(str2.charAt(i + 1)) || Character.isUpperCase(str2.charAt(i + 1)))
                    list2.add(str2.substring(i, i + 2).toUpperCase());
            }
        }
        int list2_length = list2.size();
        int a = 0;
        for (String str : list1) {
            if (list2.contains(str)) {
                int index = list2.indexOf(str);
                list2.remove(index);
                a++;
            }
        }
        int answer = 0;
        if (list1.size() == 0 && list2_length == 0)
            answer = 65536;
        else if (a == 0)
            answer = 0;
        else
            answer = 65536 * a / (list1.size() + list2_length - a);

        return answer;
    }
}