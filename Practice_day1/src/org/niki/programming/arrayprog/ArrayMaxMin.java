package org.niki.programming.arrayprog;

public class ArrayMaxMin {

	public static void maxMin(int[] arr) {
		int min = Integer.MAX_VALUE; // 2147483647
		int max = Integer.MIN_VALUE; // -2147483648
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("The max value is " + max);
		System.out.println("The min value is " + min);
	}

	public static void main(String[] args) {
		int[] nums = { 10, -7, -5, 6867, 786876, -654 };
		maxMin(nums);
	}

}
