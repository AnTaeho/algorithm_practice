package org.programmers.lv1;

public class LV1_36 {
    public static void main(String[] args) {

    }

    public String solution(String s) {
        if(s.length()%2==0) {
            return s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            return s.substring(s.length()/2,s.length()/2+1);
        }
    }
}
