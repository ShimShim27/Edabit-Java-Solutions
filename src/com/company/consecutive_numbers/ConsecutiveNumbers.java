package com.company.consecutive_numbers;

import java.util.Arrays;

/**
 * https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
 */
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] x = {-3, -2, -1, 1, 0};
        System.out.println(cons(x));
    }

    private static boolean cons(int[] input) {
        boolean canBeArrangeConsecutively = true;

        int[] sorted = Arrays.stream(input).sorted().toArray();
        int i = 0;
        while (i < sorted.length - 1) {
            if (sorted[i + 1] - sorted[i] != 1) {
                canBeArrangeConsecutively = false;
                break;
            }
            i++;
        }
        return canBeArrangeConsecutively;
    }
}
