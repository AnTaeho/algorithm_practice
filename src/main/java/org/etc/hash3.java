package org.etc;

import java.util.HashMap;
import java.util.Map;

public class hash3 {
    public static void main(String[] args) {

    }

    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : phone_book) {
            map.put(s, 0);
        }
        for (String number : phone_book) {
            for (int i = 0; i < number.length(); i++) {
                if (map.containsKey(number.substring(0, i)))
                    return false;
            }
        }
        return true;
    }
}
