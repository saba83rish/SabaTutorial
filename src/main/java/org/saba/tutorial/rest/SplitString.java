package org.saba.tutorial.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author ShabbuDhee
 *
 */
public class SplitString {

	/**
	 * \\s for white space , for coma \\. for fullstop \n for enter
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/comcast.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String input = scanner.nextLine();
			String [] sentence = input.split("\n");
			for(String s:sentence){
				//System.out.println(s);
			}
		}
		
		printNumber("123456");
	}
	//createing number without Integer.parseInt
	public static void printNumber(String numStr){
	    char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        System.out.println("zero ascii"+zeroAscii);
        for(char c:ch){
        	System.out.println("c--"+c);
            int tmpAscii = (int)c;
            System.out.println("tmpAscii--"+tmpAscii);
            sum = (sum*10)+(tmpAscii-zeroAscii);
            System.out.println("sum"+sum);
        }
	}

}
