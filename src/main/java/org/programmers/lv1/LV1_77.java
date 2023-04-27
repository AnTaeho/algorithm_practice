package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_77 {

    public static void main(String[] args) {
    }

//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        Map<String, Integer> hm = new HashMap<>();
//
//        for (String p : participant) {
//            hm.put(p, hm.getOrDefault(p, 0)+1);
//        }
//
//        for (String c : completion) {
//            hm.put(c, hm.get(c) - 1);
//        }
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0) {
//                answer = key;
//                break;
//            }
//        }
//
//        return answer;
//    }

    public String solution(String[] participant, String[] completion) {
        String join = String.join("", participant);
        for (String s : completion) {
            join = join.replaceFirst(s, "");
        }
        return join;
    }

}
