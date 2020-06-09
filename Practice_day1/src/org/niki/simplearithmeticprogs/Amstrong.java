package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class Amstrong {
	static int pow(int m, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= m;
		}
		return res;
	}

	static int count(int n) {
		int digits = 0;
		while (n > 0) {
			n = n / 10;
			digits++;
		}
		return digits;
	}

	static void checkAmstrong(int n) {
		int noOfDigits = count(n);
		int temp = n;
		int sum = 0;
		while (n != 0) {
			int lastDigit = n % 10;
			sum += pow(lastDigit, noOfDigits);
			n = n / 10;
		}

		// System.out.println(temp + " is " + (temp == sum ? "a Amstrong Number" : "not
		// a Amstrong Number"));

		if (temp == sum) {
			System.out.println(temp + " is a Amstrong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("enter n value");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			checkAmstrong(i);
		}
	}
}
