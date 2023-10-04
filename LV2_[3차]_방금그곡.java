import java.util.*;

class Solution {

    public String solution(String m, String[] musicinfos) {
        String[] answer = { "0", "0" };
        m = ChangePitch(m);

        for (int j = 0; j < musicinfos.length; j++) {

            String[] MusicList = musicinfos[j].split(",");

            int PlayTime = (Integer.parseInt(MusicList[1].substring(0, 2)) * 60
                    + Integer.parseInt(MusicList[1].substring(3, 5)))
                    - (Integer.parseInt(MusicList[0].substring(0, 2)) * 60
                            + Integer.parseInt(MusicList[0].substring(3, 5)));

            MusicList[3] = ChangePitch(MusicList[3]);
            String pitch = "";
            for (int i = 0; i < PlayTime; i++)
                pitch += MusicList[3].charAt(i % MusicList[3].length());

            if (pitch.contains(m)) {
                if (Integer.parseInt(answer[1]) < PlayTime) {
                    answer[0] = MusicList[2];
                    answer[1] = Integer.toString(PlayTime);
                }
            }
        }
        if (answer[0].equals("0"))
            return "(None)";

        return answer[0];
    }

    public String ChangePitch(String str) {
        str = str.replaceAll("C#", "I");
        str = str.replaceAll("D#", "O");
        str = str.replaceAll("F#", "J");
        str = str.replaceAll("G#", "M");
        str = str.replaceAll("A#", "N");
        return str;
    }
}