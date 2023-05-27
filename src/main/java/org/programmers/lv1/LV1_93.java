package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_93 {
    public static void main(String[] args){

    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String calling : callings) {
            int gap = map.get(calling);
            String post = players[gap - 1];

            players[gap-1] = calling;
            players[gap] = post;

            map.put(calling, map.get(calling) - 1);
            map.put(post, map.get(post)+1);
        }
        return players;
    }
}
