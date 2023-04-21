package org.programmers.lv1;

import java.util.Arrays;

public class LV1_65 {

    public static void main(String[] args) {

    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(Arrays.asList(name).contains(photo[i][j])){
                    answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])];
                }
            }
        }
        return answer;
    }

}
