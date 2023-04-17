package org.programmers.lv1;

public class LV1_22 {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        String[] split = s.split("");
        for (String s1 : split) {
            if (s1.equals("p") || s1.equals("P")) {
                count++;
            }
            if (s1.equals("y") || s1.equals("Y")) {
                count--;
            }
        }
        return count == 0;
    }

}
