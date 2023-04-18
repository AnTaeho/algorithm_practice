package org.programmers.lv1;

public class LV1_29 {
    public static void main(String[] args) {

    }

    public int solution(int num) {
        int answer = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            }
            else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            answer++;
            if (answer >= 500) {
                return -1;
            }
        }
        return answer;
    }
}
