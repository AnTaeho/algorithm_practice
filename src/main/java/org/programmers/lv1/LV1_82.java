package org.programmers.lv1;

import java.util.*;

public class LV1_82 {

    public static void main(String[] args) {
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int N = board[0].length;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < N; i++) {
                int num = board[i][move - 1];
                if (num != 0) {
                    if (!stack.empty() && stack.get(stack.size()-1) == num) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(num);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

}
