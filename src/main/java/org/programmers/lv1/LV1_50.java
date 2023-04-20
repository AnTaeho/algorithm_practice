package org.programmers.lv1;

public class LV1_50 {

    public static void main(String[] args) {

    }

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            answer.append(ch);
        }
        return answer.toString();
    }
}
