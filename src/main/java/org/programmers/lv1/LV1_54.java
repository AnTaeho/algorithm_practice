package org.programmers.lv1;

import java.util.Arrays;

public class LV1_54 {

    public static void main(String[] args) {

    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
            answer[i] = strings[i];
        }
        return answer;
    }
}
