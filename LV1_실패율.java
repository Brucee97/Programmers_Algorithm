import java.util.*;

class Solution {
    public List solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();
        int[][] try_clear = new int[N][2];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) // 실패한 사람수
                    try_clear[i - 1][0]++;
                if (i <= stages[j]) // 도전한 사람수
                    try_clear[i - 1][1]++;
            }
        }
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < try_clear.length; i++) { // (스테이지 -> 실패율) : 해시맵 생성
            if (try_clear[i][1] == 0) {
                map.put(i + 1, (double) 0);
                continue;
            }
            map.put(i + 1, (double) try_clear[i][0] / (double) try_clear[i][1]);
        }
        // 값기준 정렬
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        for (int key : keys) {
            list.add(key);
        }
        return list;
    }
}