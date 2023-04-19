package org.programmers.lv1;

public class LV1_47 {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        StringBuilder ans = new StringBuilder();
        while(n != 0) {
            ans.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(ans.toString(), 3);
    }
}
