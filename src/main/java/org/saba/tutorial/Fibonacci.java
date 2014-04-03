package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int k=6;
	System.out.println(k/10);
	System.out.println(k%10);
	for(int i=1;i<15;i++) {
		//System.out.println(regular(i) + " , ");
	}
	}
	
	public static int regular(int num) {
		
		if(num==1||num==2)
			return 1;

		return regular(num-1)+regular(num-2);

}
	
	public static void printFibo(int num) {
		
	}
}
