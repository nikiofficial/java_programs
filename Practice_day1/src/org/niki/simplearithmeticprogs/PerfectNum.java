package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class PerfectNum {

	static void checkPerfect(int n) {
		int sum = 0;
		for (int i = 1; i==1||i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (n == sum) {
			System.out.println(n + " is a perfect number");
		} 
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			checkPerfect(i);

		}
	}

}
