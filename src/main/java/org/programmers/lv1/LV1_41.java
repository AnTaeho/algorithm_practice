package org.programmers.lv1;

public class LV1_41 {
    public static void main(String[] args) {

    }

    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 0; i < count; i++) {
            total += (long) price *(i+1);
        }
        return Math.max(total - money, 0);
    }
}
