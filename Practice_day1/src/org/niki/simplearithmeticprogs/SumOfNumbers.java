package org.niki.simplearithmeticprogs;

public class SumOfNumbers {

	static int sumNum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumNum(5));
	} 

}
