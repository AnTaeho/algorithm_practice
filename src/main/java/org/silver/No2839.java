package org.silver;

import java.util.Scanner;

public class No2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = in.nextInt();
        int count = 0;
        while (true) {
            if (total % 5 == 0) {
                System.out.println(total/5 + count);
                break;
            } else if (total < 0) {
                System.out.println(-1);
            }
            total -=3;
            count ++;
        }
    }
}
