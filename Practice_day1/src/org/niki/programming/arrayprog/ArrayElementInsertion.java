package org.niki.programming.arrayprog;

public class ArrayElementInsertion {
	static int[] insertIntoArray(int pos, int value, int[] arr) {
		if (pos <= arr.length) {
			int[] newArr = new int[arr.length + 1];
			for (int i = 0, j = 0; i <= newArr.length - 1; i++) {
				if (i != pos) {
					newArr[i] = arr[j];
					j++;
				} else {
					newArr[i] = value;
				}
			}

			return newArr;
		} else {
			System.out.println("position invalid");
			return arr;
		}

	}

	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 4, 5, 6 };
		int pos = 2;
		int value = 55;
		arry=insertIntoArray(pos, value, arry);
		for (int n : arry)
			System.out.println(n);
	}

}
