package org.programmers.lv1;

import java.util.Arrays;

public class LV1_76 {

    public static void main(String[] args) {
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer += 1;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == k - 1 || reserve[j] == k + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

}
