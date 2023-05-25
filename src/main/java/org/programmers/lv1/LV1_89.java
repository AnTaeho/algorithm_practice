package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_89 {
    public static void main(String[] args){

    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String[] split = s.split("");
        for (int i = 0; i < s.length(); i++) {
            String temp = split[i];
            if (map.get(temp) == null) {
                answer[i] = -1;
                map.put(temp, i);
            } else {
                answer[i] = i - map.get(temp);
                map.put(temp, i);
            }
        }
        return answer;
    }
}
