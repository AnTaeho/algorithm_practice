package org.programmers.lv1;

import java.util.Arrays;

public class LV1_66 {

    public static void main(String[] args) {

    }

    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    int num = nums[i] + nums[j] + nums[k]; //값을 담아
                    if (checkPrime(num)){
                        answer++;
                    }
                }
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
