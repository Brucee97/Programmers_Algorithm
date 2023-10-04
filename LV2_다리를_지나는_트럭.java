import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int bridge_weight = 0;
        int time = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int truck : truck_weights) {

            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(truck);
                    bridge_weight += truck;
                    time++;
                    break;
                }
                if (bridge.size() == bridge_length) {
                    bridge_weight -= bridge.poll();
                } else {
                    if (bridge_weight + truck <= weight) {
                        bridge.add(truck);
                        bridge_weight += truck;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}