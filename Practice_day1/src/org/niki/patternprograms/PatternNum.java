package org.niki.patternprograms;

import java.util.Scanner;

public class PatternNum {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", count++);

			}
			System.out.println();
		}
	}

}
