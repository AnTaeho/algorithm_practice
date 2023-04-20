package org.programmers.lv1;

import java.util.Arrays;

public class LV1_49 {

    public static void main(String[] args) {

    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if (budget >= 0) {
                answer++;
            }
            else {
                return answer;
            }
        }
        return answer;
    }
}
