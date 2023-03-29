package org.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1445 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);

        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < a; i++) {
            A.add(in.next());
        }

        for (int i = 0; i < b; i++) {
            B.add(in.next());
        }

        for (String str : B) {
            if (A.contains(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
