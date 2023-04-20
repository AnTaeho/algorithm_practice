package org.programmers.lv1;

public class LV1_55 {

    public static void main(String[] args) {

    }

    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
