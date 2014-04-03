package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
import java.util.Stack;

public class PalindromeTest {

    public static void main(String[] args) {

        String input = "test";
        Stack<Character> stack = new Stack<Character>();
        System.out.println("initial"+stack);

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            System.out.println("stack after push"+stack);
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
            System.out.println(reverseInput);
        }

        if (input.equals(reverseInput))
            System.out.println("Yo! that is a palindrome.");
        else
            System.out.println("No! that isn't a palindrome.");

    }
}
