package org.programmers.lv1;

import java.util.Arrays;

public class LV1_9 {
    public static void main(String[] args) {
        int a = solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int length = score.length;
        while (length >= m) {
            int[] temp = new int[m];
            for (int i = 0; i < m; i++) {
                temp[i] = score[length-(i+1)];
            }
            length -= m;

            for (int i : temp) {
                System.out.println("i = " + i);
            }
            answer += temp[m-1]*m;
        }
        return answer;
    }
}
