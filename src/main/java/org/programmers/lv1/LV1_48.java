package org.programmers.lv1;

public class LV1_48 {

    public static void main(String[] args) {

    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer.append(cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
        }
        return answer.toString();
    }
}
