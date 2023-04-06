package org.programmers.lv1;

import java.util.HashSet;
import java.util.Set;

public class LV1_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int size = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int set_size = set.size();

        return Math.min(set_size, size);
    }
}
