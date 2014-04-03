package org.saba.codility;

/**
 * @author ShabbuDhee
 *
 */
public class TapeEquilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {3,1,2,4,3};
		minDiff(array);
	}
	
	public static int minDiff(int[] a) {
	    int leftSum = 0, rightSum = 0;
	    for (int ai : a) {
	        leftSum += ai;
	    }
	    System.out.println("left sum initial"+leftSum);
	    int minDiff = Integer.MAX_VALUE;
	    for (int p = a.length - 1; p >= 0; p--) {
	    	System.out.println("p-->"+p);
	    	System.out.println("a[p]-->"+a[p]);
	        rightSum += a[p];
	        leftSum -= a[p];
	        System.out.println("right sum "+rightSum);
	        System.out.println("left sum "+leftSum);
	        int diff = Math.abs(leftSum - rightSum);
	        if (diff == 0) {
	            return 0;
	        } else if (diff < minDiff) {
	            minDiff = diff;
	        }
	    }
	    return minDiff;
	}

}
