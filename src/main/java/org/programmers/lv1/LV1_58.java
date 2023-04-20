package org.programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LV1_58 {

    public static void main(String[] args) {

    }

    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (!answer.contains(numbers[i] + numbers[j])) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }
}
