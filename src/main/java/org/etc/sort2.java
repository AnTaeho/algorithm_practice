package org.etc;

import java.util.Arrays;

public class sort2 {
    public static void main(String[] args) {

    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length-1; i >= 0; i--) {
            if (i > citations[i]) {
                return i;
            }
        }
        return 0;
    }

}
