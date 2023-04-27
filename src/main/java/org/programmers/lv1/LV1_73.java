package org.programmers.lv1;

public class LV1_73 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int count_zero = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                count_zero++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    count++;
                }
            }
        }
        if (count == 0 && count_zero == 0) {
            return new int[]{6, 6};
        }
        if (count==0) {
            return new int[]{1, 6};
        }
        return new int[]{7-count - count_zero, 7-count};
    }
}
