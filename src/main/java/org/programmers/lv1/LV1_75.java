package org.programmers.lv1;

public class LV1_75 {

    public static void main(String[] args) {
    }

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
            x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            answer.append(String.valueOf(i).repeat(Math.min(x[i], y[i])));
        }

        if("".equals(answer.toString())){
            return "-1";
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else {
            return answer.toString();
        }
    }

}
