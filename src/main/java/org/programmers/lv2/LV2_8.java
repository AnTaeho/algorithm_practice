package org.programmers.lv2;

import java.util.Arrays;

public class LV2_8 {
    public static void main(String[] args) {

    }

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = citations.length -1 ; i >= 0 ; i--) {
            if(citations.length -i >= citations[i])
                break;
            answer++;
        }
        return answer;
    }
}
