package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class AllMultiplicationTables {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N value:");
		int n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}

}