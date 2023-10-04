import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();

        for (String st : cities) {

            if (cacheSize == 0) {
                answer = 5 * cities.length;
                break;
            }

            String str = st.toLowerCase();

            // 처음 1회
            if (cache.isEmpty()) {
                answer += 5;
                cache.add(str);
                continue;
            }

            // miss
            if (!cache.contains(str)) {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                    cache.add(str);
                } else
                    cache.add(str);
                continue;
            }

            // hit
            if (cache.contains(str)) {
                answer += 1;
                int index = cache.indexOf(str);
                cache.remove(index);
                cache.add(str);
                continue;
            }
        }
        return answer;
    }
}