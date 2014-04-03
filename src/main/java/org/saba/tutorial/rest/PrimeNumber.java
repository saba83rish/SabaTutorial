package org.saba.tutorial.rest;

import java.util.Scanner;

/**
 * @author ShabbuDhee
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//primeChecker(num);
	}
	
	
	public  boolean primeChecker(int input) {
		boolean isPrime = true;
		if(input==0 || input ==1) {
			isPrime=false;
			System.out.println("NOT A PRIME");
			return isPrime;
		} else {
			
			for(int i=2;i<=Math.sqrt(input);i++) {
				if(input%i==0) {
					isPrime=false;
					break;
				}
				
			}
			if(isPrime)
				System.out.println("PRIME");
			else
				System.out.println("NOT A PRIME");
			
		}
			
			return isPrime;
			
	}
	
	public static void checkPrime() {

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean prime = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				prime=false;
				
			} 
		}
		
		if(prime)
			System.out.println(num + " is  PRIME");
		else 
			System.out.println(num + " is  NOT PRIME");
	
	}

}
