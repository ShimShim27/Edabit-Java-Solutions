package com.company.product_of_two_prime_numbers;

/**
 * https://edabit.com/challenge/8b6hgBwoRAzqbAbYA
 */
public class ProductOfTwoPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(productOfPrimes(2059));
        System.out.println(productOfPrimes(5767));
        System.out.println(productOfPrimes(77));
        System.out.println(productOfPrimes(12));
    }


    private static boolean productOfPrimes(int num) {
        boolean isProductOfPrime = false;
        int divider = 2;
        while (!isProductOfPrime && divider < num) {
            if (num % divider == 0) {
                int quotient = num / divider;

                if (checkIfPrime(quotient) && checkIfPrime(divider)) isProductOfPrime = true;
            }
            divider++;
        }
        return isProductOfPrime;
    }

    private static boolean checkIfPrime(int num) {
        boolean isPrime = true;
        int divider = 2;
        while (isPrime && divider < num) {
            isPrime = num % divider != 0;
            divider++;
        }
        return isPrime;

    }
}
