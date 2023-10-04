import java.util.*;

class Solution {
    public List solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> park = new HashMap<>();
        HashMap<String, Integer> Time = new HashMap<>();

        // 입/출차 기록
        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            String car = str[1];
            int time = Integer.parseInt(str[0].substring(0, 2)) * 60 + Integer.parseInt(str[0].substring(3, 5));

            if (str[2].equals("IN")) {
                park.put(car, time);
            }
            if (str[2].equals("OUT")) {
                if (!Time.containsKey(car)) {
                    Time.put(car, time - park.get(car));
                    park.remove(car);
                    continue;
                }
                if (Time.containsKey(car)) {
                    Time.put(car, (time - park.get(car)) + Time.get(car));
                    park.remove(car);
                    continue;
                }
            }
        }

        // 미출차 차량 처리
        for (HashMap.Entry<String, Integer> remain : park.entrySet()) {
            if (!Time.containsKey(remain.getKey())) {
                Time.put(remain.getKey(), (23 * 60 + 59) - remain.getValue());
                continue;
            }
            if (Time.containsKey(remain.getKey())) {
                Time.put(remain.getKey(), ((23 * 60 + 59) - remain.getValue()) + Time.get(remain.getKey()));
                continue;
            }
        }
        park.clear();

        // 차량 번호 기준 정렬 후 요금 기록
        List<String> keySet = new ArrayList<>(Time.keySet());
        Collections.sort(keySet);
        for (String s : keySet) {
            if (Time.get(s) <= fees[0])
                answer.add(fees[1]);
            else {
                int addition_time = Time.get(s) - fees[0];
                if (addition_time % fees[2] == 0) {
                    answer.add(fees[1] + fees[3] * (addition_time / fees[2]));
                    continue;
                }
                if (addition_time % fees[2] != 0) {
                    answer.add(fees[1] + fees[3] * (addition_time / fees[2] + 1));
                    continue;
                }
            }
        }

        return answer;
    }
}