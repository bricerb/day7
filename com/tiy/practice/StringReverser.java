package com.tiy.practice;

import java.util.Scanner;

public class StringReverser {

//    String userString = "Something";
//    char[] stringCharacters = userString.toCharArray();
//    the stringCharacters array will have every character in the string userString
    // Reference for toCharArray() and char[]

    public static void reverser() throws Exception{
        Scanner inputScanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("\n0. Main Menu");
            System.out.println("1. Reverse a String");
            int userChoice = Integer.valueOf(inputScanner.nextLine());

            if (userChoice == 0) {
                loop = false;
            } else if (userChoice == 1){

                System.out.println("String to be reversed: ");
                String userString = inputScanner.nextLine();

                //Takes user String

                char[] stringChars = userString.toCharArray();

                //Converts String to Characters

                int arrayEnd = 1;
                int reverser = stringChars.length - arrayEnd;

                // Loops from end of array to beginning by using array.length - 1 (last element).
                // Increases arrayEnd by 1 each time the loop runs to get the previous element in the array.

                while (reverser >= 0) {
                    System.out.print(stringChars[reverser]);
                    reverser--;
                }
                System.out.println("\n");
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

//    public static void negativeReverser() {
//        Scanner inputScanner = new Scanner(System.in);
//        System.out.println("String to be reversed: ");
//        String userString = inputScanner.nextLine();
//
//        char[] stringChars = userString.toCharArray();
//
//        int reverser = (stringChars.length);
//
//        for (int currentChar = reverser; currentChar >= 0; reverser --)
//            if (reverser == stringChars.length) {
//            continue;
//            } else {
//                System.out.println(stringChars[stringChars.length - currentChar]);
//            }
            // Possibly a way to user negative values to count up to 0 to find element.
//    }
}