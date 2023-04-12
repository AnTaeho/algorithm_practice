package org.programmers.lv1;

public class LV1_12 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<goal.length){
            if(i < cards1.length&&goal[k].equals(cards1[i])){
                k++;
                i++;
            } else if(j < cards2.length&&goal[k].equals(cards2[j])){
                k++;
                j++;
            } else break;
        }

        return k==goal.length ? "Yes" : "No";
    }
}
