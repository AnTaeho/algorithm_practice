package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_84 {

    public static void main(String[] args) {
    }

    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            Integer index = map.get(calling);
            String temp = players[index-1];
            players[index-1] = players[index];
            players[index] = temp;
            map.put(calling,map.get(calling)-1);
            map.put(temp,map.get(calling)+1);
        }
        return players;
    }

}
