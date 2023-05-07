package org.etc;

import java.util.*;

public class hash1 {
    public static void main(String[] args) {

    }

    public int solution(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            temp.add(num);
        }
        return Math.min(nums.length/2, temp.size());
    }
}
