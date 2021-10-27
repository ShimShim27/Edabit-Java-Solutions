package com.company.unmix_my_string;

/***
 * https://edabit.com/challenge/XRAGxXj4KtakkvD3F
 */
public class UnMixMyString {
    public static void main(String[] args) {
        System.out.println(unmix("1234567"));
    }

    private static String unmix(String input) {
        StringBuilder unmixed = new StringBuilder();
        String[] splitted = input.split("");
        int len = splitted.length;
        int index = 0;
        while (index < len) {
            String first;
            String second = "";


            first = splitted[index];
            index++;
            if (index < len) second = splitted[index];
            index++;

            unmixed.append(second).append(first);
        }
        return unmixed.toString();
    }
}
