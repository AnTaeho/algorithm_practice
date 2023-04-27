package org.programmers.lv1;

public class LV1_81 {

    public static void main(String[] args) {
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        int[] alphabets = new int[26];

        for (int i = 0; i < alphabets.length; i++) {
            char target = (char) ('A' + i);
            alphabets[i] = Integer.MAX_VALUE;

            for (String key : keymap) {
                int loc = key.indexOf(target) + 1;
                if (loc != 0) {
                    alphabets[i] = Math.min(alphabets[i], loc);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int tmpSum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
            }
        }

    }

}
