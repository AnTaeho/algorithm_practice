package org.programmers.lv1;

public class LV1_42 {
    public static void main(String[] args) {

    }

    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return false;
        }
        return true;
    }
}
