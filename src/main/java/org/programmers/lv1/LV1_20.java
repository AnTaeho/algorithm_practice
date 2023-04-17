package org.programmers.lv1;

public class LV1_20 {
    public static void main(String[] args) {

    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }

}
