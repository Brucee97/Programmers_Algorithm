class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i=1; i<s.length(); i++) {
            if(!s.substring(0,i).contains(s.substring(i, i+1)))
                answer[i] = -1;
            if(s.substring(0,i).contains(s.substring(i, i+1))) {
                answer[i] = i -s.substring(0,i).lastIndexOf(s.substring(i, i+1));
    q        }
        }
        return answer;
    }
}