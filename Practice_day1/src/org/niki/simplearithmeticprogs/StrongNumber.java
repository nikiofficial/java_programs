package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class StrongNumber {
	static int fact(int num) {
		int value = 1;
		for (int i = 2; i <= num; i++) {
			value *= i;
		}
		return value;
	}

	static void strongNum(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int last = n % 10;
			int result = fact(last);
			sum += result;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("strong number");
		} else {
			System.out.println("not strong number");
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		strongNum(n);
        
	}

}
