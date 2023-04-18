package org.programmers.lv1;

public class LV1_35 {
    public static void main(String[] args) {

    }

    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}
