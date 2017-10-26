package javaCode;

import java.util.Scanner;

public class stringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String fullName = sc.nextLine();

		System.out.println("Entered text:" + fullName);

		// Upper case
		System.out.println("Upper Case: " + fullName.toUpperCase());

		// lower case
		System.out.println("Lower Case: " + fullName.toLowerCase());

		// trimmed
		System.out.println("Trimmed: " + fullName.trim());

		// length
		System.out.println("Length : " + fullName.length());

		// reverse
		String reversename="";

		for (int i = fullName.length() - 1; i >= 0; i--) {
			reversename=reversename + fullName.charAt(i);
		}

		System.out.println("Reverse: " + reversename);
		
		System.out.print("is palindrome? : ");
		
		if (reversename.equals(fullName)) {
			System.out.print("Yes, Text is palindrome.");
		}else{
			System.out.print("No, Text is not palindrome.");
		}
		
	}
}
