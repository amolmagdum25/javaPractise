package com.javaPractise.homework;

import java.util.Scanner;

public class doWhile_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cOper = "y";
		int iOperation;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Add");
			System.out.println("2. Substract");
			System.out.println("3. Multiply");
			System.out.println("4. Division");
			System.out.printf("Select one action above: ");
			iOperation = sc.nextInt();

			System.out.printf("Enter 1 number: ");
			int i = sc.nextInt();
			System.out.printf("Enter 2 number: ");
			int j = sc.nextInt();

			switch (iOperation) {
			case 1:
				System.out.println("Addtion is :" + (i + j));
				break;

			case 2:
				System.out.println("Subtraction is :" + (i - j));
				break;

			case 3:
				System.out.println("multiplication is :" + (i * j));
				break;

			case 4:
				System.out.println("Division is :" + (i / j));
				break;

			default:
				System.out.println("Select a valid operation.");

			}
			
			System.out.println("Do you want to continue with another operation- y/n");
			cOper = sc.next();
			
		} while (cOper.equals("Y") || cOper.equals("y"));

		System.out.println("The operation is closed.");

	}

}
