package javaCode;

import java.awt.Color;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * String[] colors = new String[5]; for (int i = 0; i < colors.length;
		 * i++) { System.out.println("Enter color name-" +(i+1)+":");
		 * colors[i]=sc.next(); }
		 */

		String[] colors = new String[5];
		colors[0] = "Red";
		colors[1] = "Red";
		colors[2] = "Red";
		colors[3] = "Red";
		colors[4] = "Red";

		System.out.println("Colors list is- ");
		for (String color : colors) {
			System.out.print(color + ", ");
		}

		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println(("Enter color to search: "));
		String searchColor = sc.next();

		for (String color : colors) {

		}

	}
}
