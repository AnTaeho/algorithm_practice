package org.programmers.lv1;

public class LV1_83 {

    public static void main(String[] args) {
    }

    public String solution(String new_id) {
        String a = new_id.toLowerCase();
        char[] chars = a.toCharArray();
        StringBuilder b = new StringBuilder();
        for (char c : chars) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                b.append(c);
            }
        }
        String c = b.toString().replace("..", ".");
        while (c.contains("..")) {
            c = c.replace("..", ".");
        }
        if (c.length() > 0) {
            if (c.charAt(0) == '.') {
                c = c.substring(1);
            }
        }
        if (c.length() > 0) {
            if (c.charAt(c.length() - 1) == '.') {
                c = c.substring(0, c.length() - 1);
            }
        }

        if (c.equals("")) {
            c = "a";
        }

        if (c.length() >= 16) {
            c = c.substring(0, 15);

            if (c.charAt(c.length() - 1) == '.') {
                c = c.substring(0, c.length() - 1);
            }
        }

        StringBuilder d = new StringBuilder(c);
        if (d.length() <= 2) {
            char last = d.charAt(d.length() - 1);

            while (d.length() < 3) {
                d.append(last);
            }
        }

        return d.toString();
    }

}
