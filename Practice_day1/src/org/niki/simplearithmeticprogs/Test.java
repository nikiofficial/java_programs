package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class Test {
	static void perfN(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println(n + (n == sum ? " perfect number" : " not a perfect number"));
	}

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scannner = new Scanner(System.in);
		int n = scannner.nextInt();
		for (int i = 1; i <= n; i++)
			perfN(i);
	}

}
