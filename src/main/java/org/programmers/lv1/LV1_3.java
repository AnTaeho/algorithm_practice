package org.programmers.lv1;

import java.util.Arrays;

public class LV1_3 {

    public static void main(String[] args) {

    }

    public int solution(int[][] sizes) {
        int hMax = 0;
        int wMax = 0;
        for (int[] size : sizes) {
            int[] ints = Arrays.stream(size).sorted().toArray();
            if (ints[0] > hMax) {
                hMax = ints[0];
            }
            if (ints[1] > wMax) {
                wMax = ints[1];
            }
        }
        return hMax*wMax;
    }
}
