package com.company.almost_palindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * https://edabit.com/challenge/E9AHcnWg7fDfardLF
 */
public class AlmostPalindrome {
    public static void main(String[] args) {
        System.out.println(almostPalindrome("1234321"));
        System.out.println(almostPalindrome("abccia"));
        System.out.println(almostPalindrome("abcdaaa"));
        System.out.println(almostPalindrome("1234312"));
    }

    private static boolean almostPalindrome(String input) {
        boolean isAlmostPalindrome = false;

        if (!new StringBuilder(input).reverse().toString().equals(input)) {

            List<String> allPossible = new ArrayList<>();
            String[] splitted = input.split("");
            for (String s : splitted) {
                if (!allPossible.contains(s)) allPossible.add(s);
            }


            int i = 0;
            while (i < splitted.length && !isAlmostPalindrome) {
                for (String s : allPossible) {
                    StringBuilder builder = new StringBuilder(input).replace(i, i + 1, s);
                    isAlmostPalindrome = builder.toString().equals(builder.reverse().toString());
                    if (isAlmostPalindrome) break;
                }
                i++;
            }
        }


        return isAlmostPalindrome;
    }
}
