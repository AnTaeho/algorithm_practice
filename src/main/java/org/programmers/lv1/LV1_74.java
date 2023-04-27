package org.programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class LV1_74 {

    public static void main(String[] args) {
        solution(5, 3, 2);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powers = new int[number+1];
        for (int i = 1; i <= number; i++) {
            int part = getPart(i);
            System.out.println("part = " + part);
            if (part > limit) {
                powers[i] = power;
            } else {
                powers[i] = part;
            }
        }
        for (int i : powers) {
            answer+=i;
        }
        return answer;
    }

    private static int getPart(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) count++;
            else if (n % i == 0) count += 2;
        }
        return count;
    }
}
