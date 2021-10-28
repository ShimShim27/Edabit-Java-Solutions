package com.company.word_buckets;

import java.util.ArrayList;
import java.util.List;

/**
 * https://edabit.com/challenge/3FAMXz4wAYGqpCtDR
 */
public class WordBuckets {
    public static void main(String[] args) {
        bucketize("she sells sea shells by the sea", 10);
        bucketize("the mouse jumped over the cheese", 7);
        bucketize("fairy dust coated the air", 20);
        bucketize("a b c d e", 2);
    }

    private static List<String> bucketize(String phrases, int maxSize) {
        List<String> bucket = new ArrayList<>();
        String[] splitted = phrases.split(" ");
        int index = 0;

        String toBeAdded = "";
        while (index < splitted.length) {
            String testString = toBeAdded;
            if (!testString.isEmpty()) testString += " ";
            testString += splitted[index];
            if (testString.length() <= maxSize) toBeAdded = testString;
            else if (!toBeAdded.isEmpty()) {
                bucket.add(toBeAdded);
                toBeAdded = splitted[index];
            }
            index++;

        }

        if (!toBeAdded.isEmpty()) bucket.add(toBeAdded);

        return bucket;
    }
}
