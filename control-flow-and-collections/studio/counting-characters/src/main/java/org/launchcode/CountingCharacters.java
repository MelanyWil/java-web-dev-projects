package org.launchcode;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count characters: ");
        String userInput = input.nextLine();
        String sentenceOld = userInput.toLowerCase();
        String sentence = sentenceOld.replaceAll("[^a-z]", "");
//        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = sentence.toCharArray();
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (char i : charArray) {
            if (characterMap.containsKey(i)) {
                characterMap.put(i, characterMap.get(i) + 1);
            } else {
                characterMap.put(i, 1);
            }
        }
        for (Map.Entry<Character, Integer> ckey : characterMap.entrySet()) {
            System.out.println(ckey.getKey() + ": " + ckey.getValue());
        }
    }
}
