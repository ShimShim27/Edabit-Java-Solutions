package com.company.needle_in_a_hex_string;

/**
 * https://edabit.com/challenge/xhhLGZzhwvkN6AR29
 */
public class NeedleInAHexString {
    public static void main(String[] args) {
        System.out.println(firstIndex("42 6f 72 65 64 20 77 6f 72 6c 64", "Bored"));
    }

    private static int firstIndex(String hexes, String toBeFound) {
        StringBuilder hexesString = new StringBuilder();
        for (String hex : hexes.split(" ")) {
            hexesString.append((char) Integer.parseInt(hex, 16));
        }


        int counter = 0;
        boolean isFound = false;
        int firstToBeFoundIndex = 0;
        while (counter < hexesString.length() && !isFound) {
            StringBuilder current = new StringBuilder();

            for (int i = counter; i < hexesString.length(); i++) {
                current.append(hexesString.substring(i, i + 1));
                if (current.toString().equals(toBeFound)) {
                    firstToBeFoundIndex = counter;
                    isFound = true;
                    break;
                }
            }

            counter++;
        }
        return firstToBeFoundIndex;
    }
}
