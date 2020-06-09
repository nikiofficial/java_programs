package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class Factorial {
	static int fact(int num) {
		int value = 1;
		for (int i = num; i >= 2; i--) {
			value *= i;
		}
		return value;
	}

	static int factRecursive(int n) {
		if (n >= 2) {
			return n * factRecursive(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			int value = factRecursive(i);
			System.out.println("the factorial of " + i + " is " + value);
		}
	}

}
