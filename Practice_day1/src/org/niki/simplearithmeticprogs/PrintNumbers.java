package org.niki.simplearithmeticprogs;

public class PrintNumbers {
	static void printNum(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("*********");
		int i = 1;
		while (i <= num) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("***********");
		i = 1;
		do {
		
			System.out.print(i + " ");
			i++;
		} while (i <= num);
	}

	public static void main(String[] args) {
		printNum(50);
	}

}
