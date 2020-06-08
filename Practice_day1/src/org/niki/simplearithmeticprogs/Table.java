package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N value:");
		int n = scanner.nextInt();
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

}
