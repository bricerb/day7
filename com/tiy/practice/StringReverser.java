package com.tiy.practice;

import java.util.Scanner;

public class StringReverser {

//    String userString = "Something";
//    char[] stringCharacters = userString.toCharArray();
//    the stringCharacters array will have every character in the string userString
    // Reference for toCharArray() and char[]

    public static void reverser() throws Exception{
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("#####  String Reverser #####\n");
            System.out.println("type exit to return to previous menu");
            System.out.println("String to be reversed: ");
            String userString = inputScanner.nextLine();
            if (userString.equals("exit")) {
                break;
            }
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