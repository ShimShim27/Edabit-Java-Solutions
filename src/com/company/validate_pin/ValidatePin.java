package com.company.validate_pin;

/**
 * https://edabit.com/challenge/sCP58J9vcexchgwo7
 */
public class ValidatePin {
    public static void main(String[] args) {
        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1"));
        System.out.println(validate("900876"));
        System.out.println(validate(" 4983"));

    }

    private static boolean validate(String input){
        String regex = "[0-9]";
        return input.matches(String.format("%s{4}|%s{6}",regex,regex));
    }
}
