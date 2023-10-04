import java.util.*;

class Solution {

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < players.length; i++)
            map.put(players[i], i);

        for (int i = 0; i < callings.length; i++) {
            int rank = map.get(callings[i]); // 불린 선수의 기존 순위
            String player = players[map.get(callings[i]) - 1]; // 추월당한 선수의 이름
            players[rank - 1] = callings[i];
            players[rank] = player;

            map.put(callings[i], rank - 1);
            map.put(player, rank);

        }

        return players;
    }
}