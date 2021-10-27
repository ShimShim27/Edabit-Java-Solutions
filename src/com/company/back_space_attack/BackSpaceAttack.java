package com.company.back_space_attack;

/**
 * https://edabit.com/challenge/hYKyiwgw9Ni5ELtDL
 */
public class BackSpaceAttack {
    public static void main(String[] args) {
        System.out.println(erase("major# spar##ks"));
    }

    private static String erase(String input) {
        StringBuilder builder = new StringBuilder();
        for (String s : input.split("")) {
            if (s.equals("#")) {
                if (builder.length() > 0) builder.delete(builder.length() - 1, builder.length());
            } else builder.append(s);
        }

        return builder.toString();
    }
}
