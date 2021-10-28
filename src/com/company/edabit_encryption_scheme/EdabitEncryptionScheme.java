package com.company.edabit_encryption_scheme;

/**
 * https://edabit.com/challenge/jfCsugyp9BSLYEtwb
 */
public class EdabitEncryptionScheme {
    public static void main(String[] args) {

        System.out.println( encryption("chillout"));
        System.out.println( encryption("feedthedog"));
        System.out.println( encryption("Back to Square One is a popular saying that means a person has to start over, similar to: back to the drawing board."));
    }

    private static String encryption(String input) {
        String trimmed = input.replace(" ","");
        int rowSize = Integer.parseInt(String.valueOf(Math.sqrt(trimmed.length())).split("\\.")[0]);
        int columnSize = rowSize + 1;

        if (rowSize * columnSize < input.length())rowSize = columnSize;

        String[][] arr = new String[rowSize][columnSize];
        int row = 0;
        int column = 0;
        for (String s : trimmed.split("")) {
            arr[row][column] = s;
            column++;
            if (column >= columnSize) {
                column = 0;
                row++;

            }
        }

        StringBuilder out = new StringBuilder();
        for (int c=0;c<columnSize;c++){
            for (int r=0;r<rowSize;r++){
                String s = arr[r][c];
                if (s!= null) out.append(s);
            }
            out.append(" ");
        }

        return out.substring(0,out.length()-1);
    }
}
