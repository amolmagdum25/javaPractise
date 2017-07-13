package com.javaPractise.homework;

import java.util.Scanner;

public class studentMarkOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks of 4 subjects out of 100 marks:");

		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();

		int total = sub1 + sub2 + sub3 + sub4;
			System.out.println("Total of 4 subject is: " + total);
			System.out.println("Percentage is : " + (total * 100) / 400 + "%");

	}
}
