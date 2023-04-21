package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_60 {

    public static void main(String[] args) {

    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(c);
                map.put(c, i);
            }
        }
        return answer;
    }
}
