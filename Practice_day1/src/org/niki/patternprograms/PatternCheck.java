package org.niki.patternprograms;

import java.util.Scanner;

public class PatternCheck {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==1||j==n||j==i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
