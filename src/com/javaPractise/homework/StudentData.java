package com.javaPractise.homework;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int stuID, stuAge;
		float stuWeight, stuHeight;
		String fullName;

		System.out.println("Enter student Name: ");
		fullName = sc.nextLine();
		//System.out.println();
		
		System.out.println("Enter student ID: ");
		stuID = sc.nextInt();

		System.out.println("Enter student Age: ");
		stuAge = sc.nextInt();

		System.out.println("Enter student height: ");
		stuHeight = sc.nextFloat();

		System.out.println("Enter student weight: ");
		stuWeight = sc.nextFloat();

		System.out.println(" Student ID: " + stuID + "\n Student name: " + fullName + "\n Student age: " + stuAge
				+ "\n Student height: " + stuHeight + "\n Student weight: " + stuWeight);

	}

}
