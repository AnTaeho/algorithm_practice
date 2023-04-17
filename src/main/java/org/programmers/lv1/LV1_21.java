package org.programmers.lv1;

public class LV1_21 {
    public static void main(String[] args) {

    }

    public int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }

}
