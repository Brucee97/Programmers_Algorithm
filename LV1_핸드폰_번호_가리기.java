class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if (phone_number.length() == 4)
            answer = phone_number;
        else {
            for (int i = 0; i < phone_number.length() - 4; i++) {
                answer += "*";
            }
            answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
        }
        return answer;
    }
}