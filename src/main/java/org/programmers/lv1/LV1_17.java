package org.programmers.lv1;

public class LV1_17 {
    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer + n;
    }
}
