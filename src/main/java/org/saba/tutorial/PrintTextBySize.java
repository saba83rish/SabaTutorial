package org.saba.tutorial;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Requirement is to break a paragraph into separate lines with each having not more than 13 characters. 
 * And also the words in those lines should not be broken or adjoined (basically they should be meaningful words)
 * For breaking a text easier way is to use a substring but it breaks the word and prints meaningless words.
 * So the easier way is to store individual words in an array and run a loop to print them sequentially in a line
 * When the line reaches the size limit of 13 print a new line and continue
 * Prerequisite for this code to run is to read the text from an external text file named comcast.txt placed in the root folder.
 * Advantage being that we can replace the text inside the text file with any other text and don't have to hard code the text inside a class file.
 * A hard coded option is also provided
 * @author Sabarish Chandrasekharan
 *
 */
public class PrintTextBySize {

	public static String lineSeparator = System.getProperty("line.separator");
	public static int size = 13;
	/**
	 * Main Method
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// read the input text from an external file.
		//if you want you can ignore this line and hard code the text
		String read = readFile("/comcast.txt");
		//if you want you can comment above line and uncomment below line for simplicity
		//String read = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";		String[] wordArray = read.trim().split(" ");		
		String[] wordArray = read.trim().split(" ");
		printBySize(size,wordArray);


	}

	/**
	 * Reads a text file from an external location and converts it to string
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	private static String readFile(String pathname) throws IOException {

		File file = new File(pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);

		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Pass the word array and the size to print the output in console
	 * @param size
	 * @param wordArray
	 */
	private static void printBySize(int size, String[] wordArray) {
		StringBuilder bld = new StringBuilder(size);
		for(int i=0; i<wordArray.length;i++) {
			
			String word = wordArray[i];
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
		System.out.println(bld.toString());
	}
	

}
