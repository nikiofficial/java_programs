package org.niki.programming.collectionexample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); // growable or resizable array
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		System.out.println(al); // [1, 2, 3, 4]

		System.out.println(al.size()); // 4

		for (Integer integer : al) {
			System.out.println(integer);
		}

		// al.clear(); removes all the elements in the collection

		LinkedList<Integer> list = new LinkedList<>(al); // doubly linked list
		System.out.println(list);

	}
}
