package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
public class Varargs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(testVararg("1","2","3"));
		System.out.println(testVararg("9","3","1","3","5","6","7"));

	}
	
	private static String testVararg(String... test) {
		String testReturn = null;
		for(String arg : test){
			testReturn=testReturn+arg;
		}
		return testReturn;
		
	}

}
