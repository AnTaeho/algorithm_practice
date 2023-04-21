package org.programmers.lv1;

import java.util.*;

public class LV1_62 {

    public static void main(String[] args) {

    }

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length/2);
    }
}
