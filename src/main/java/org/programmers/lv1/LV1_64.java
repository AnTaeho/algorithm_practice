package org.programmers.lv1;

public class LV1_64 {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean checkPrime(int i) {
        if (i == 1) {
            return false;
        }
        else if (i == 2 || i == 3) {
            return true;
        }
        else {
            for (int j = 2; j <  Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
