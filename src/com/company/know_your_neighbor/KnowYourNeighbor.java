package com.company.know_your_neighbor;

/**
 * https://edabit.com/challenge/ka4Mk98LW4TEbcqzH
 */
public class KnowYourNeighbor {
    public static void main(String[] args) {
        System.out.println(plusSign("+d+i+#+c+"));
        System.out.println(plusSign("+d+=3=+s+"));
        System.out.println(plusSign("f++d+g+8+"));
        System.out.println(plusSign("+s+7+fg+r+8+"));
    }

    private static boolean plusSign(String input) {
        return input.replaceAll("[^+A-Za-z0-9]", "").matches("((\\+[A-Za-z0-9]\\+*)+)\\+");
    }
}
