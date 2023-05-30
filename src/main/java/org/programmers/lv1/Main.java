package org.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
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

        boolean flag;

        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == '.' && arr[i][j - 1] == '.') {
                    if(!flag) continue;
                    result1++;
                    flag = false;
                }
                if(arr[i][j]=='X') flag = true;
            }
        }

        for (int j = 0; j < n; j++) {
            flag = true;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1][j] == '.' && arr[i][j] == '.') {
                    if(!flag) continue;
                    result2++;
                    flag = false;
                }
                if(arr[j][i]=='X') flag = true;
            }
        }
        System.out.println(result1 + " " + result2);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}