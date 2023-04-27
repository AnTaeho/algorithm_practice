package org.programmers.lv1;

public class LV1_72 {

    public static void main(String[] args) {

    }

    public int solution(int n, int m, int[] section) {
        int max = 0;
        int count = 0;
        for (int paint : section) {
            if (max <= paint) {
                max = paint+m;
                count++;
            }
        }
        return count;
    }
}
