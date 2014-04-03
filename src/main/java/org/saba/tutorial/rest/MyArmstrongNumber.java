package org.saba.tutorial.rest;

/**
 * @author ShabbuDhee
 *
 */
public class MyArmstrongNumber {
	 
    public boolean isArmstrongNumber(int number){
         
        int tmp = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        int div = 0; 
        System.out.println(number);
        while(tmp > 0) 
        { 
            div = tmp % 10; 
            System.out.println("div---"+div);
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
                System.out.println("temp---"+temp);
            }
            sum += temp;
            tmp = tmp/10; 
            System.out.println("sum---"+sum);
            System.out.println("tmp---"+tmp);
        } 
        if(number == sum) {
            return true; 
        } else {
            return false; 
        } 
    }
     
    public static void main(String a[]){
        MyArmstrongNumber man = new MyArmstrongNumber();
        System.out.println("Is 371 Armstrong number? "+man.isArmstrongNumber(371));
        System.out.println("Is 523 Armstrong number? "+man.isArmstrongNumber(523));
        System.out.println("Is 153 Armstrong number? "+man.isArmstrongNumber(153));
    }
}
