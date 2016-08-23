package com.tiy.practice;

import java.util.Scanner;

/**
 * Created by Brice on 8/16/16.
 */
public class JavaCasing {

    public static void javaCase() throws Exception {
        Scanner inputScanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println();
            System.out.println("0. Exit");
            System.out.println("1. Reverse a String");
            int userChoice = Integer.valueOf(inputScanner.nextLine());
            System.out.println();
            System.out.println("Enter a string to be converted to proper Java format : ");
            String userString = inputScanner.nextLine();
            System.out.println();
//            String userString = "Test String To JAVA";

            System.out.println("1. Is it a Variable?");
            System.out.println("2. Is it a Method?");
            System.out.println("3. Is it a Class?");

            userChoice = Integer.valueOf(inputScanner.nextLine());

            if (userChoice == 1) {
                String[] parts = userString.split(" ");

                // Splits every time Space bar to an array

                int indexLocation = 0;
                String part = parts[indexLocation];
                char[] stringToChar = part.toCharArray();

                System.out.print(part.toLowerCase());
                indexLocation++;

                // allows me to create an array of chars to evaluate what needs to be done to each substring.

                while (indexLocation < stringToChar.length) {
                    part = parts[indexLocation];
                    System.out.print(part.substring(0, 1).toUpperCase());
                    System.out.print(part.substring(1).toLowerCase());
                    indexLocation++;
                }

            } else if (userChoice == 2) {
                String[] parts = userString.split(" ");

                // Splits every time Space bar to an array

                int indexLocation = 0;
                String part = parts[indexLocation];
                char[] stringToChar = part.toCharArray();

                System.out.print(part.toLowerCase());
                indexLocation++;

                // allows me to create an array of chars to evaluate what needs to be done to each substring.

                while (indexLocation < stringToChar.length) {
                    part = parts[indexLocation];
                    System.out.print(part.substring(0, 1).toUpperCase());
                    System.out.print(part.substring(1).toLowerCase());
                    indexLocation++;
                }
                System.out.println("()");
            } else if (userChoice == 3) {
                String[] parts = userString.split(" ");

                // Splits every time Space bar to an array

                int indexLocation = 0;
                String part = parts[indexLocation];
                char[] stringToChar = part.toCharArray();

                // allows me to create an array of chars to evaluate what needs to be done to each substring.

                while (indexLocation < stringToChar.length) {
                    part = parts[indexLocation];
                    System.out.print(part.substring(0, 1).toUpperCase());
                    System.out.print(part.substring(1).toLowerCase());
                    indexLocation++;
                }
                System.out.println("{}");
            } else {
                System.out.println("Invalid Input. Please try again.");
            }

        }
    }
        // Loops through and allows uppercase first letter, with lowercase rest.
}