package org.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class LV1_71 {

    public static void main(String[] args) {

    }

    public int solution(String dartResult) {
        int[] dart = new int[3];
        int idx=0;
        StringBuilder numstr= new StringBuilder();
        for(int i=0;i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            if(c>='0'&&c<='9'){
                numstr.append(c);
            }
            else if(c=='S'||c=='D'||c=='T'){
                int n=Integer.parseInt(numstr.toString());
                if(c=='S'){
                    dart[idx++]=(int)Math.pow(n,1);
                }
                else if(c=='D'){
                    dart[idx++]=(int)Math.pow(n,2);
                }
                else{
                    dart[idx++]=(int)Math.pow(n,3);
                }
                numstr = new StringBuilder();
            }
            else {
                if(c=='*'){
                    dart[idx-1]*=2;
                    if(idx-2>=0) dart[idx-2]*=2;
                }
                else {
                    dart[idx-1]*=(-1);
                }
            }
        }
        return dart[0]+dart[1]+dart[2];
    }
}
