package com.company.no_yelling;

public class NoYelling {
    public static void main(String[] args) {
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
        System.out.println(noYelling("What went wrong?????????"));

    }

    public static String noYelling(String input) {
        String[] splitted = input.split(" ");
        if (splitted.length > 0) {
            splitted[splitted.length - 1] = splitted[splitted.length - 1].replaceAll("[?]+", "?").replaceAll("[!]+", "!");
        }

        StringBuilder result = new StringBuilder();
        for (String s : splitted) result.append(s).append(" ");
        return result.substring(0,result.length());
    }
}
