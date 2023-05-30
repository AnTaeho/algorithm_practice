package org.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class LV1_95 {
    public static void main(String[] args){

    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(br.readLine());

        int result1 = 0;
        int result2 = 0;

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String[] splitLine = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = splitLine[j].charAt(0);
            }
        }

        if(n == 1){
            System.out.println(0 + " " + 0);
            return;
        }

        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') {
                    count1++;
                }
                if (count1 >= 2) {
                    result1++;
                    break;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == '.') {
                    count2++;
                }
                if (count2 >= 2) {
                    result1++;
                    break;
                }
            }
        }

        System.out.println(result1 + " " + result2);
    }
}
