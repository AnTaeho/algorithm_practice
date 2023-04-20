package org.programmers.lv1;

public class LV1_52 {

    public static void main(String[] args) {

    }

    public int solution(int[][] sizes) {
        int maxH = 0;
        int maxW = 0;
        for (int[] size : sizes) {
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);
            maxH = Math.max(maxH, max);
            maxW = Math.max(maxW, min);
        }
        return maxH*maxW;
    }
}
