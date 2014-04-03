package org.saba.tutorial;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author ShabbuDhee
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Requirement is to break a paragraph into separate lines with each having not more than 13 characters. 
 * And also the words in those lines should not be broken or adjoined (basically they should be meaningful words)
 * For breaking a text easier way is to use a substring but it sometimes breaks and prints meaningless words.
 * So we have to stick with the scanner to read each word at a time and then append it to a string buffer or string builder(non synchronized) and when the size 
 * reaches 13 append it with a break(separator) and create a new string builder object and continue.
 * Prerequisite for this code to read the text from an external text file named comcast.txt placed in the root folder.
 * Advantage being that we can replace the text inside the text file with anything and don't have to hard code the text inside a class file.
 * @author Sabarish Chandrasekharan
 *
 */
public class PrintTextTask {
	
	//read the size globally
    public static int size = 13;
	public static String lineSeparator = System.getProperty("line.separator");

    public static void main(String[] args) throws FileNotFoundException {
    	//easier way to read it from a text file rather than feeding the input to scanner every time in eclipse.
    	File file = new File("/comcast.txt");
		Scanner scanFile = new Scanner(file);
        StringBuilder bld = new StringBuilder(size);
        //checks for the text
        while (scanFile.hasNextLine()) {
        
            Scanner scNewLine = new Scanner(scanFile.nextLine());
            //checks if next word is available from the text goes till the last word is fetched 
            while (scNewLine.hasNext()) {
            	//fetches the next word to print.
                String word = scNewLine.next();
                //check if current size of builder + size of the picked word is greater than or equal to our size
                if ((bld.length() + word.length()) >= size) {
     
                	//if yes add a new line and create a new builder for the new line
                	bld.append(lineSeparator);
                    System.out.print(bld.toString());
                    bld = new StringBuilder(word);
                }
                else {
                	//appends a space character and the word, but beginning of line doesnt need a space so append with empty string
                	bld.append((bld.length() == 0 ? "" : " ") + word);
                }
            }
        }
        //work around to print the last word
        if (bld.length() > 0) {
            System.out.print(bld.toString() + lineSeparator);
        }
       
    }
    



}
