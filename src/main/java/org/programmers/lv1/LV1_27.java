package org.programmers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LV1_27 {
    public static void main(String[] args) {

    }

    public boolean solution(int x) {
        int sum = 0;
        List<Integer> collect = Arrays.stream(String.valueOf(x).split("")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer integer : collect) {
            sum+=integer;
        }
        return x%sum == 0;
    }
}
