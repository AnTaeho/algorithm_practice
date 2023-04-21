package org.programmers.lv1;

public class LV1_69 {

    public static void main(String[] args) {

    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        int length1 = cards1.length;
        int length2 = cards2.length;
        for (String s : goal) {
            if (cards1[idx1].equals(s) && idx1 <= length1-1){
                idx1++;
            } else if (cards2[idx2].equals(s) && idx2 <= length2 -1) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

}
