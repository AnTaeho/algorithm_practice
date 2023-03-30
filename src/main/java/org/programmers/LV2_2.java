package org.programmers;

import java.util.HashMap;
import java.util.Map;

public class LV2_2 {
    public static void main(String[] args) {

    }

    public static boolean solution(String[] phone_book) {
        Map<String, Integer> number_set = new HashMap<>();

        for (String s : phone_book) {
            number_set.put(s, 0);
        }

        for (String number : phone_book) {
            for (int i = 0; i < number.length(); i++) {
                if (number_set.containsKey(number.substring(0, i)))
                    return false;
            }
        }
        return true;
    }
}
