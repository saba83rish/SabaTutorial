package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
public class RecursiveReverseString {
	
	public static String reverse = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println(recursiveReverse("hello world!"));

	}
	
	public static String recursiveReverse(String input) {
		System.out.println("input--->"+input);
		int len = input.length();
		if(len==1)
			return input;
		reverse +=input.charAt(len-1)+recursiveReverse(input.substring(0, len-1));
		System.out.println("reverse--->"+reverse);
		return reverse;
	}

}
