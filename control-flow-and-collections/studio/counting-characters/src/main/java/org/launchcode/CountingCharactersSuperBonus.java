package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersSuperBonus {

    public static void main(String[] args) {

        String sentenceFromFile = "";

        try {
            File textFromFile = new File("src/main/java/org/launchcode/sentence.txt");
            Scanner myReader = new Scanner(textFromFile);
            if (myReader.hasNextLine()) {
                sentenceFromFile = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can not find file");
        }

        String sentence = sentenceFromFile.replaceAll("[^a-zA-Z]", "");
        char[] charArray = sentence.toLowerCase().toCharArray();
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
