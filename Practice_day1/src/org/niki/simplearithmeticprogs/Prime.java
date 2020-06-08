package org.niki.simplearithmeticprogs;

public class Prime {

	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			boolean isPrime = prime(i);
			if (isPrime) {
				sum += i;
			}
			System.out.println(i + " is " + (isPrime ? "prime" : "not prime"));
		}
		System.out.println("The sum is " + sum);
	}

	private static boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
