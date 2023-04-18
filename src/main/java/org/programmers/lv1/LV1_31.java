package org.programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LV1_31 {
    public static void main(String[] args) {

    }

    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
            return answer;
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }
}
