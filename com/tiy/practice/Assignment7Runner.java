package com.tiy.practice;

import java.util.Scanner;

public class Assignment7Runner {
	
	public static void main (String[] args) throws Exception {
		Scanner userInput = new Scanner(System.in);

		while (true) {
			System.out.println("\nHello.\n\n");
			System.out.println("1. Would you like to reverse some Strings?");
			System.out.println("2. Would you like to format Strings into a Variable/Method/Class?");
			System.out.println("\n0. Exit");
			int userSelection = Integer.valueOf(userInput.nextLine());

			if (userSelection == 1) {
				StringReverser stringReverser = new StringReverser();
				stringReverser.reverser();
				userSelection =0;
			} else if (userSelection == 2) {
				JavaCasing javaCasing = new JavaCasing();
				javaCasing.javaCase();
				userSelection =0;
			} else if (userSelection == 0) {
				break;
			} else {
				System.out.println("\nInvalid selection. Please try again.\n");
			}
		}
	}
}