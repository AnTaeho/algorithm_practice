package org.programmers;

import java.util.ArrayList;
import java.util.List;

public class LV2_4 {
    public static void main(String[] args) {
    }

    public class Solution {
        public List<Integer> solution(int []arr) {

            List<Integer> list = new ArrayList<>();
            int temp = -1;

            for(int n : arr) {
                if(temp != n) list.add(n);
                temp = n;
            }


            return list;
        }
    }
}
