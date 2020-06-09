package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class Fib {

	static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		int[] arr = new int[n + 1];
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scanner.nextInt();
		System.out.println(fib(n));
	}
}