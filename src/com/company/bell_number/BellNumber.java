package com.company.bell_number;

import java.util.ArrayList;
import java.util.List;

/**
 * https://edabit.com/challenge/Rarq6J9wR8FsN2qQ4
 */
public class BellNumber {
    public static void main(String[] args) {
        System.out.println(bell(6));
    }


    private static int bell(int row) {
        List<Integer> prev = new ArrayList<>();

        for (int i = 1; i <= row; i++) {
            if (prev.isEmpty()) prev.add(1);
            else {
                List<Integer> current = new ArrayList<>();
                current.add(prev.get(prev.size()-1));
                for (int p:prev){
                    current.add(p + current.get(current.size()-1));
                }

                prev.clear();
                prev.addAll(current);

            }
        }

        return prev.get(prev.size() - 1);

    }
}
