package org.niki.simplearithmeticprogs;

public class EvenNum {
	static void printEven(int n) {
		for (int i = 2; i <= n; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n*****");
		for (int i = 1; i <= n; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		printEven(80);
	}

}
