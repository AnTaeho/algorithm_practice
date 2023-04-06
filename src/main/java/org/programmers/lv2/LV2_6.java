package org.programmers.lv2;

public class LV2_6 {
    public static void main(String[] args) {

    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        for (int i = 1; i < total; i++) {
            int row = i;
            int col = total / i;
            if (row > col) {
                continue;
            }
            if ((row-2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }

}
