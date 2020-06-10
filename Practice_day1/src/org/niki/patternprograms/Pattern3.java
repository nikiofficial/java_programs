package org.niki.patternprograms;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = 3, st = 1, sp = n - 1;
		for (int i = 1; i <= n * 2 - 1; i++) {
			for (int j = 1; j <= sp; j++)
				System.out.print("   ");

			for (int j = 1; j <= st; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			if (i < n) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
		}
	}
}