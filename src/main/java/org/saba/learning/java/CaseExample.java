package org.saba.learning.java;

import java.util.Scanner;

import com.sun.source.tree.DoWhileLoopTree;

/**
 * @author ShabbuDhee
 *
 */
public class CaseExample

{

   public static void main(String[] args)

   {
	   doWhilePgm();
	  
   }
   /**
    * do while
    */
   public static void doWhilePgm() {
	   String ans;
	   Scanner scan = new Scanner(System.in);
	   do

	      {

	         System.out.print("Please answer yes or no: ");

	         ans = scan.nextLine();

	      } while (!ans.equals("yes") && !ans.equals("no"));

	      

	      System.out.println("Thanks for your answer of " + ans);

	   }
   /**
    * case study
    */
   public static void caseStudy() {


	      for (int k = 1; k <= 4; k++)

	      {
	    	  System.out.println("k--->"+k);
	         switch (k)

	         {

	            case 1:

	               System.out.println("one");

	               break; // exit switch command

	            case 2:

	               System.out.println("two");

	               break; // exit switch command

	            case 3:

	               System.out.println("three");

	               System.out.println("See what happens when you forget the break command");

	            case 4:

	               System.out.println("four");

	               break;

	         }

	      }

	   
   }

   

}
