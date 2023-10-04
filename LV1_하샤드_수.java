class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String number = Integer.toString(x);
        String[] arr = new String[number.length()];
        arr = number.split("");
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            y += Integer.parseInt(arr[i]);
        }
        if (x % y != 0)
            answer = false;
        return answer;
    }
}