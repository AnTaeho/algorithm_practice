package org.programmers.lv1;

public class LV1_59 {

    public static void main(String[] args) {

    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            String s = String.valueOf(i).repeat(count);
            answer.append(s);
        }
        answer.append("0");
        for (int i = food.length-1; i >= 1; i--) {
            int count = food[i] / 2;
            String s = String.valueOf(i).repeat(count);
            answer.append(s);
        }
        return answer.toString();
    }
}
