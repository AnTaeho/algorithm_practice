package org.programmers;

import java.util.ArrayList;
import java.util.List;

public class LV1_4 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(solution(answers));
    }

    public static List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < answers.length; i++) {
            int s1 = i % 5;
            int s2 = i % 8;
            int s3 = i % 10;
            if (a1[s1] == answers[i]) {
                c1++;
            }
            if (a2[s2] == answers[i]) {
                c2++;
            }
            if (a3[s3] == answers[i]) {
                c3++;
            }
        }
        int tempMax = Math.max(c1, c2);
        int max = Math.max(tempMax, c3);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        if (max == c1) {
            answer.add(1);
        }
        if (max == c2) {
            answer.add(2);
        }
        if (max == c3) {
            answer.add(3);
        }

        return answer;
    }
}
