package org.niki.programming.arrayprog;

public class RevArray {

	static void reverseArray(int[] arr) {
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		reverseArray(nums);
		for(int n: nums) {
			System.out.println(n);
			
		}
	}

}
