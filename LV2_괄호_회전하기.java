import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, s.length()) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(c);
                    continue;
                }
                if (c == '}' && stack.contains('{')) {
                    stack.pop();
                    continue;
                }
                if (c == ')' && stack.contains('(')) {
                    stack.pop();
                    continue;
                }
                if (c == ']' && stack.contains('[')) {
                    stack.pop();
                    continue;
                }
                stack.add(c);
            }
            if (stack.isEmpty())
                answer++;
        }
        return answer;
    }
}