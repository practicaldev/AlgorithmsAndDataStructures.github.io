package com.rameshify.practice.exercism;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public static final int ALPHABETS_LENGTH = 26;

    public boolean isPangram(String input) {
        /* Null or Empty? Not a Pangram. */
        if (input == null || input.length() == 0) {
            return false;
        }
        /* Lowercase all */
        input = input.toLowerCase();
        /* store used chars */
        Set<Character> usedChars = new HashSet<>();
        for (char oneChar : input.toCharArray()) {
            if (Character.isLetter(oneChar)) {
                usedChars.add(oneChar);
            }
        }
        /* if we used all alphabets then its a Pangram */
        return usedChars.size() == ALPHABETS_LENGTH ? true : false;
    }
}