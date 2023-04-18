package org.programmers.lv1;

public class LV1_32 {
    public static void main(String[] args) {

    }

    public String solution(String phone_number) {
        String[] split = phone_number.split("");
        for (int i = 0; i < split.length - 4; i++) {
            split[i] = "*";
        }
        return String.join("", split);
    }
}
