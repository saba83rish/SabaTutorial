package org.saba.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ShabbuDhee
 * 
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 2, 6, 4, 7, 3, 7, 3, 7, 4, 7, 8, 9, 32,
				343, 54, 4 };
		bubbleSort(array);

	}

	public static void bubbleSort(int[] a)

	{
		boolean sorted;
		do {
			System.out.println("DO LOOP");
			// Consider the array to be sorted.
			sorted = true;
			// Walk through the array. Remember to stop before we
			// go too far and get an array index out of bounds error.
			for (int i = 0; i < a.length - 1; i++) {
				System.out.println("i-->"+i);
				// Look at each cell and its neighbor.
				if (a[i] > a[i + 1]) {
					// The cells are not in sorted order so swap them.
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					// Now consider the array to not be sorted.
					sorted = false;
				}
			}
			print(a);
		} while (!sorted);
	}

	public static void print(int[] a) {

		for (int k = 0; k < a.length; k++) {

			System.out.print(a[k] + " ");
		}
		System.out.println("\n\n");
	}
}
