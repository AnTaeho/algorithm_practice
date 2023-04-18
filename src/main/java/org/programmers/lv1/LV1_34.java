package org.programmers.lv1;

public class LV1_34 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(min, j);
        }
        int index = 0;
        for (int j : arr) {
            if (j == min) {
                continue;
            }
            answer[index++] = j;
        }
        return answer;
    }
}
