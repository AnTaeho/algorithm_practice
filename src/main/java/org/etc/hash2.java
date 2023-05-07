package org.etc;

import java.util.HashMap;
import java.util.Map;

public class hash2 {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        return "";
    }
}
