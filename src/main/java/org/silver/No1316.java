package org.silver;

import java.util.Scanner;

public class No1316 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check()) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = in.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);


            if (prev != now) {

                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;
                    prev = now;
                }

                else {
                    return false;
                }
            }
        }
        return true;
    }
}
