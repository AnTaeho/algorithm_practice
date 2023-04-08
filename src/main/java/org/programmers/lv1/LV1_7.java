package org.programmers.lv1;

public class LV1_7 {
    public static void main(String[] args) {

    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (a <= n) {
            int temp = n / a;
            answer += temp*b;
            n = temp*b + n%a;
        }
        return answer;
    }
}
