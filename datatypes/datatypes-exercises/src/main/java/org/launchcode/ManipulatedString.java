package org.launchcode;

public class ManipulatedString {

    public static void removeWord(String sentence, String input) {

        int index = sentence.indexOf(input);
        int length = input.length();
        System.out.println("Your search term appears at index " + index + " and is " + length
        + " characters long");

        String AliceUpdate = sentence.replace(input, "");
        System.out.println(AliceUpdate);
    }
}
