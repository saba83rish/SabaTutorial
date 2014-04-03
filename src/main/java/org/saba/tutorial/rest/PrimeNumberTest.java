package org.saba.tutorial.rest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author ShabbuDhee
 *
 */
@RunWith(Parameterized.class)
public class PrimeNumberTest {
	
	private Integer inputNumber;
	   private boolean expectedResult;
	   private PrimeNumber primeNumber;
	   
	   @Before
	   public void initialize() {
		   primeNumber = new PrimeNumber();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public PrimeNumberTest(Integer inputNumber, 
	      boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	   
	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	   }
	   
	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, primeNumber.primeChecker(inputNumber));
	   }
	   
	   
}
