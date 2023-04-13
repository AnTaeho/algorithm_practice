package org.programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class LV1_13 {
    public static void main(String[] args) {

    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> powers = new ArrayList<>();
        powers.add(1);
        for (int i = 2; i <= number; i++) {
            powers.add(getPower(i));
        }
        for (Integer integer : powers) {
            if (integer <= limit) {
                answer += integer;
            }
            else {
                answer += power;
            }
        }
        return answer;
    }

    private int getPower(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }

        return count;
    }
}
