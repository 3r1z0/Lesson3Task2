package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter apartment number: ");
		Scanner sc = new Scanner(System.in);
		int apartmentNumber;
		apartmentNumber = sc.nextInt();
		int flour = 0;
		int check;
		int frontDoor = 0;

		if (apartmentNumber >= 1 && apartmentNumber <= 36) {
			frontDoor = 1;
			flour = apartmentNumber / 4;
			check = apartmentNumber % 4;
			if (check > 0) {
				++flour;
			}
			System.out.println("Apartment is in " + frontDoor + " front door and on the " + flour + " flour ");
		} else if (apartmentNumber >= 37 && apartmentNumber <= 72) {
			frontDoor = 2;
			flour = apartmentNumber / 4;
			flour -= 9;
			check = apartmentNumber % 4;
			if (check > 0) {
				++flour;
			}
			System.out.println("Apartment is in " + frontDoor + " front door and on the " + flour + " flour ");
		} else if (apartmentNumber >= 73 && apartmentNumber <= 108) {
			frontDoor = 3;
			flour = apartmentNumber / 4;
			flour -= 18;
			check = apartmentNumber % 4;
			if (check > 0) {
				++flour;
			}
			System.out.println("Apartment is in " + frontDoor + " front door and on the " + flour + " flour ");
		} else if (apartmentNumber >= 109 && apartmentNumber <= 144) {
			frontDoor = 4;
			flour = apartmentNumber / 4;
			flour -= 27;
			check = apartmentNumber % 4;
			if (check > 0) {
				++flour;
			}
			System.out.println("Apartment is in " + frontDoor + " front door and on the " + flour + " flour ");
		} else {
			System.out.println("Incorrect apartment number, try again later.");
		}

	}

}
