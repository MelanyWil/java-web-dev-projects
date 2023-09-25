package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String fiveLetters (ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        double userInput = input.nextDouble();
        StringBuilder result = new StringBuilder();
        for (String item: arr) {
            if (item.length() == userInput) {
                result.append(item).append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);
        integerList.add(7);
        integerList.add(4);
        integerList.add(8);
        integerList.add(3);
        integerList.add(6);
        integerList.add(9);
        integerList.add(12);

        int evenNums = sumEven(integerList);
        System.out.println(evenNums);

        ArrayList<String> wordCount = new ArrayList<>();
        wordCount.add("apple");
        wordCount.add("banana");
        wordCount.add("orange");
        wordCount.add("green");
        wordCount.add("brown");
        wordCount.add("cat");
        wordCount.add("dog");
        wordCount.add("alice");
        wordCount.add("seven");
        wordCount.add("six");

        String words = fiveLetters(wordCount);
        System.out.println(words);

    }
}
