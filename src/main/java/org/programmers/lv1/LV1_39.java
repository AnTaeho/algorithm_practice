package org.programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class LV1_39 {
    public static void main(String[] args) {

    }

    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Comparator.reverseOrder());
        return String.join("", split);
    }
}
