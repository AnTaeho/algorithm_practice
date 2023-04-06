package org.programmers.lv1;

public class LV1_1 {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int result = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if (diff <= num) result++;
        }
        return result;
    }
}
