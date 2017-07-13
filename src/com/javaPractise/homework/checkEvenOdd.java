package com.javaPractise.homework;

import java.util.Scanner;

// Enter a number to check it is even or odd
public class checkEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no : ");
		number = sc.nextInt();
		
		if (number%2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}
	}

}
