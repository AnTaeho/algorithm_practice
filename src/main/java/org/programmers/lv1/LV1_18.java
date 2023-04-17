package org.programmers.lv1;

public class LV1_18 {
    public static void main(String[] args) {

    }

    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer/arr.length;
    }
}
