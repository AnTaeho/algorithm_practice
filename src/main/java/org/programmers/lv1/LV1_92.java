package org.programmers.lv1;

public class LV1_92 {
    public static void main(String[] args){

    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] fac = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            if (s.contains(fac[0] + fac[0]) || s.contains(fac[1] + fac[1]) || s.contains(fac[2] + fac[2]) || s.contains(fac[3] + fac[3])) {
                continue;
            }
            for (String s1 : fac) {
                s = s.replace(s1, " ");
            }
            s = s.replace(" ", "");
            if (s.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
