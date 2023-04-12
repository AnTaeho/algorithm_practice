package org.programmers.lv1;

public class LV1_11 {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        System.out.println(solution(food));

    }

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            answer.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        answer.append(0);
        for (int i = food.length-1; i >= 1; i--) {
            answer.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        return answer.toString();
    }
}
