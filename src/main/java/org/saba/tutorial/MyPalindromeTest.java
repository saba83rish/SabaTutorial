package org.saba.tutorial;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ShabbuDhee
 * 
 */
public class MyPalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*
		String test = "test";
		StringBuilder sb = new StringBuilder();
		for (int idx = (test.length()); idx > 0; idx--) {
			sb.append(test.charAt(idx - 1));
			// System.out.println(sb);

		}
		if (test.equals(sb.toString())) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT");
		}

		
		if (test.equals(StringUtils.reverse(test)))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT");
			*/
		checkPalindrome("MALAYALAMA");

	}
	
	public static void checkPalindrome(String input) {
		StringBuilder sb = new StringBuilder(input);
		if(input.toLowerCase().equals(sb.reverse().toString().toLowerCase())){
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
			
	}

}
