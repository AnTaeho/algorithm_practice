package org.etc;

import java.util.HashMap;
import java.util.Map;

public class hash4 {
    public static void main(String[] args) {

    }

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        for (Integer value : map.values()) {
            answer *= value;
        }
        return answer -1;
    }
}
