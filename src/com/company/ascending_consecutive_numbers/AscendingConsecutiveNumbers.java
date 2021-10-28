package com.company.ascending_consecutive_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://edabit.com/challenge/YzWb77MowQpixfpWh
 */
public class AscendingConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(ascending("919920921"));
    }

    private static boolean ascending(String input) {
        int length = 1;
        boolean isAscending = false;
        while (length < input.length() && !isAscending) {
            int index = 0;
            List<Integer> nums = new ArrayList<>();
            while (index < input.length()) {
                String num = "";
                try {
                    num = input.substring(index, index + length);
                } catch (Exception e) {
                    num = input.substring(index);
                }

                nums.add(Integer.parseInt(num));
                index += length;
            }


            System.out.println(nums);
            int i = 0;

            boolean isConsecutive = true;
            while (i < nums.size() - 1 && isConsecutive) {
                isConsecutive = nums.get(i+1) - nums.get(i) == 1;
                i++;
            }

            isAscending = isConsecutive;
            length++;
        }

        return isAscending;
    }
}
