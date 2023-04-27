package org.programmers.lv1;

public class LV1_79 {

    public static void main(String[] args) {
    }

    public int solution(String s) {
        int answer = 0;
        String[] split = s.split("");
        String x = split[0];
        int same = 0;
        int diff = 0;
        for (String s1 : split) {
            if (same + diff == 0) {
                x = s1;
            }
            if (s1.equals(x)) {
                same++;
            } else {
                diff++;
            }
            if (same == diff) {
                answer++;
                same = 0;
                diff = 0;
            }
        }
        if (same + diff != 0) {
            answer += 1;
        }
        return answer;
    }

}
