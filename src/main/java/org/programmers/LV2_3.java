package org.programmers;

import java.util.HashMap;
import java.util.Map;

public class LV2_3 {
    public static void main(String[] args) {

    }
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> kind = new HashMap<>();
        for (String[] clothe : clothes) {
            if (kind.containsKey(clothe[1])) {
                kind.put(clothe[1], kind.get(clothe[1]) + 1);
            } else {
                kind.put(clothe[1], 1);
            }
        }
        for (Integer value : kind.values()) {
            answer *= (value+1);
        }
        return answer-1;
    }
}
