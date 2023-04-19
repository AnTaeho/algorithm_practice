package org.programmers.lv1;

public class LV1_45 {

    public static void main(String[] args) {

    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int number = getNumber(n, m);
        answer[0] = number;
        answer[1] = n*m / number;
        return answer;
    }

    private int getNumber(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}
