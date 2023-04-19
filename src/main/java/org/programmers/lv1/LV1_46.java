package org.programmers.lv1;

public class LV1_46 {

    public static void main(String[] args) {

    }

    public int[] solution(int []arr) {
        int j = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];

        int[] answer = new int[j];
        System.arraycopy(temp, 0, answer, 0, j);

        return answer;
    }
}
