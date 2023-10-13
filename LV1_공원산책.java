class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;

        loop: for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break loop;
                }
            }
        }

        for (String str : routes) {
            x = move(park, x, y, str)[0];
            y = move(park, x, y, str)[1];
        }

        int[] answer = { x, y };
        return answer;
    }

    public int[] move(String[] park, int start_x, int start_y, String routes) {
        String[] arr = routes.split(" ");
        int[] m = { 0, 0 };
        int length = Integer.parseInt(arr[1]);
        for (int i = 0; i < length; i++) {
            if (arr[0].equals("E")) {
                m[1]++;
                if (start_y + m[1] < park[0].length()) {
                    if (park[start_x].charAt(start_y + m[1]) != 'X')
                        continue;
                    else
                        return new int[] { start_x, start_y };
                } else
                    return new int[] { start_x, start_y };
            }
            if (arr[0].equals("W")) {
                m[1]--;
                if (start_y + m[1] >= 0) {
                    if (park[start_x].charAt(start_y + m[1]) != 'X')
                        continue;
                    else
                        return new int[] { start_x, start_y };
                } else
                    return new int[] { start_x, start_y };
            }
            if (arr[0].equals("S")) {
                m[0]++;
                if (start_x + m[0] < park.length) {
                    if (park[start_x + m[0]].charAt(start_y) != 'X')
                        continue;
                    else
                        return new int[] { start_x, start_y };
                } else
                    return new int[] { start_x, start_y };
            }
            if (arr[0].equals("N")) {
                m[0]--;
                if (start_x + m[0] >= 0) {
                    if (park[start_x + m[0]].charAt(start_y) != 'X')
                        continue;
                    else
                        return new int[] { start_x, start_y };
                } else
                    return new int[] { start_x, start_y };
            }
        }
        return new int[] { start_x + m[0], start_y + m[1] };
    }
}