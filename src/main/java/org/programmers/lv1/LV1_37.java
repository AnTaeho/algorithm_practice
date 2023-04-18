package org.programmers.lv1;

public class LV1_37 {
    public static void main(String[] args) {

    }

    public String solution(int n) {
        if (n % 2 == 0) {
            return "수박".repeat(n / 2);
        } else {
            return  "수박".repeat(n / 2) + "수";
        }
    }
}
