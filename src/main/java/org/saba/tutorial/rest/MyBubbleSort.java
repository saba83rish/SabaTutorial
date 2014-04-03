package org.saba.tutorial.rest;

import java.util.Arrays;

/**
 * @author ShabbuDhee
 *
 */
public class MyBubbleSort {
	 
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
        	System.out.println("m---->"+m);
            for (int i = 0; i < n - 1; i++) {
            	System.out.println("i-->"+i);
                k = i + 1;
                System.out.println("k-->"+k);
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
              
            }
          printNumbers(array);
        }
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      printNumbers(array);
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
 
    }
}
