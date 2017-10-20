package com.rameshify.practice.exercism;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {

    public static final int ALPHABETS_LENGTH = 26;

    public boolean isPangram(String input) {
        return Arrays.stream(
                input.replaceAll("[^a-zA-Z]", "")
                        .toLowerCase()
                        .split("")
        ).collect(
                Collectors.toSet()
        ).size() == ALPHABETS_LENGTH;
    }
}