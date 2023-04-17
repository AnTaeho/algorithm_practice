package org.programmers.lv1;

public class LV1_26 {
    public static void main(String[] args) {

    }

    public long solution(long n) {
        StringBuilder answer = new StringBuilder();
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);
        }
        for(int j = 0; j < str.length()-1; j++){
            for(int i = 0; i < str.length()-1; i++) {
                if (arr[i] < arr[i+1]) {
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int i = 0; i < str.length(); i++){
            answer.append(arr[i]);
        }
        return Long.parseLong(answer.toString());
    }

}
