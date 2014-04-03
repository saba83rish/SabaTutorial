package org.saba.tutorial.rest;

/**
 * @author ShabbuDhee
 *
 */
public class Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = { 2, 4, 4, 5, 4, 1 };
		int sum = sum(num);
		int leftsum =0;
		int rightsum = sum;
		int middleindex = 0;
		for(int i=0;i<num.length-1;i++){
			leftsum+=num[i];
			System.out.println("leftsum :"+leftsum);
			rightsum-=num[i];
			System.out.println("rightsum :"+rightsum);
			if(leftsum==rightsum){
				middleindex=i;
				break;
			}
				
		}
		
		System.out.println("middle index is "+middleindex);

	}
	
	public static int total(int number){
		return number*(number+1)/2;
	}
	
	public static int sum(int[] num){
		int sum = 0;
		for(int i:num){
			sum+=i;
		}
		return sum;
	}
	
	

}
