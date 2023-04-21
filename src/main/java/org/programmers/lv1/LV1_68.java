package org.programmers.lv1;

import java.util.Arrays;

public class LV1_68 {

    public static void main(String[] args) {

    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length - 1; i >= 0; i--) {
            if ((score.length - i) % m == 0) {
                answer += score[i]*m;
            }
        }
        return answer;
    }

}
