package org.niki.patternprograms;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		n=n-1;
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
