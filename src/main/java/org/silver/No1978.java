package org.silver;

import java.util.Scanner;

public class No1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tryCount = in.nextInt();

        int count = 0;

        for (int i = 0; i < tryCount; i++) {
            boolean isPrime = true;

            int num = in.nextInt();

            if(num == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }

}
