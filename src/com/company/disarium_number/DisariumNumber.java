package com.company.disarium_number;

/**
 * https://edabit.com/challenge/GjCgCugvh4eorPmgM
 */
public class DisariumNumber {
    public static void main(String[] args) {
        System.out.println(isDisarium(544));
    }

    private static boolean isDisarium(int input) {
        String[] splitted = String.valueOf(input).split("");
        int poweredSum = 0;
        int counter = 0;
        while (counter < splitted.length) {
            poweredSum += Math.pow(Integer.parseInt(splitted[counter]), counter+1);
            counter++;
        }
        return input == poweredSum;
    }

}
