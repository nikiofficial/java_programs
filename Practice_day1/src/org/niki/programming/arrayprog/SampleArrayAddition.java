package org.niki.programming.arrayprog;

public class SampleArrayAddition {
	// write a program to calculate the sum of integers in the given array
	static int calculateSumOfArrayElements(int[] arr) {
		int sum = 0;
		for (int array : arr) {
			sum += array;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 7, 7 };
		System.out.println(arr.length);
		int result = SampleArrayAddition.calculateSumOfArrayElements(arr);
		System.out.println(result);
	}
}
