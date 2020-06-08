package org.niki.simplearithmeticprogs;

public class CheckOddEven {
	static void checkEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		System.out.println(n % 2 == 0 ? "even" : "odd");
		String[] res = { "even", "odd" };
		System.out.println(res[n % 2]);
		System.out.println((n & 1) == 0 ? "even" : "odd");
	}

	public static void main(String[] args) {
		checkEvenOdd(15);
	}

}
