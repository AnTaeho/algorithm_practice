package org.programmers.lv1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LV1_94 {
    public static void main(String[] args){

    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> collect = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (Integer integer : collect) {
            if (k <= 0) {
                break;
            }
            k -= integer;
            answer++;
        }
        return answer;
    }
}
