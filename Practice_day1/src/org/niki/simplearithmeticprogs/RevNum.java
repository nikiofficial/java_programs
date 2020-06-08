package org.niki.simplearithmeticprogs;

import java.util.Scanner;

public class RevNum {
	static int revNumber(int num) {
		int rev = 0;
		while (num != 0) {

			int last = num % 10; // 4
			num = num / 10; // 13
			rev = (rev * 10) + last; //
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scanner.nextInt();
		int revr = revNumber(n);
		System.out.println("reverse of " + n + " is " + revr);
		System.out.println(revr == n ? "palindrome" : "not palindrome");

	}

}
