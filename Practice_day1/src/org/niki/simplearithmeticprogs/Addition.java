package org.niki.simplearithmeticprogs;

public class Addition {
	public static void add(int... numbers) {
		int sum = 0;
		for(int num:numbers) {
			sum += num;
		}
		System.out.println("The sum of two numbers is " + sum);
	}

	public static void main(String[] args) {
		add(4, 5, 4 , 3, 2, 1, 6, 7, 2);
		System.out.println("Hello world");
	}
}
