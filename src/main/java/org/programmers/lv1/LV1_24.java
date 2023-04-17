package org.programmers.lv1;

public class LV1_24 {
    public static void main(String[] args) {

    }

    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }

}
