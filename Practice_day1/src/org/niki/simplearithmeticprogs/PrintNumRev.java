package org.niki.simplearithmeticprogs;

public class PrintNumRev {

	static void numRev(int num) {
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n***********");
		int i = num;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println("\n***********");
		i = num;
		do {
			System.out.print(i + " ");
			i--;
		} while (i >= 1);
	}

	public static void main(String[] args) {
		numRev(100);
	}

}
