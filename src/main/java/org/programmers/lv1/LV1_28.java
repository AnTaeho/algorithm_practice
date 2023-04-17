package org.programmers.lv1;

public class LV1_28 {
    public static void main(String[] args) {

    }

    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
