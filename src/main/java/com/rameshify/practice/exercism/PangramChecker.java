package com.rameshify.practice.exercism;

public class PangramChecker {

    public boolean isPangram(String input) {
        // Null or Empty? Not a Pangram.
        if (input == null || input.length() == 0) {
            return false;
        }
        //we must find atleast one from these
        char[] alphabetz = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        // Special cases (including digits)
        String[] specialz = {" ", "\"", ".", "\\d+"};
        //
        String allLowercase = input.toLowerCase();
        //Iterate over alphabets and replace one at a time
        for (char aChar : alphabetz) {
            // record length before replace
            int preLength = allLowercase.length();
            // perform replace
            allLowercase = allLowercase.replace("" + aChar, "");
            // record length after replace
            int postLength = allLowercase.length();
            // if length before and after are equal, then we didn't find a match. Return false (not a Pangram).
            if (preLength == postLength) {
                return false;
            }
        }
        for (String nonAlpha : specialz) {
            int preReplace = allLowercase.length();
            //nothing to replace
            if (preReplace == 0) break;
            allLowercase = allLowercase.replaceAll(nonAlpha, "");
        }
        // if nothing left, then its a Pangram
        return allLowercase.isEmpty() ? true : false;
    }
}