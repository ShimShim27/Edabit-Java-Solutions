package com.company.largest_gap;

import java.util.Arrays;

/**
 * https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
 */
public class LargestGap {
    public static void main(String[] args) {
        System.out.println(largestGap(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14}));
    }

    private static int largestGap(int[] input) {
        int largest = 0;
        int[] sorted = Arrays.stream(input).sorted().toArray();
        for (int i = 0; i < input.length - 1; i++) {
            int currentGap = sorted[i + 1] - sorted[i];
            if (currentGap > largest) largest = currentGap;
        }

        return largest;
    }
}
