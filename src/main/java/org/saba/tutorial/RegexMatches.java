package org.saba.tutorial;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
    private static final String REGEX = "seven|fathers";
    private static final String INPUT =
                                    "_jhsjdforthjhj";
	public static String lineSeparator = System.getProperty("line.separator");

    public static void main( String args[] ) throws IOException{
       int count = 0;
       String read = readFile("/comcast.txt");
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(read); // get a matcher object
       while(m.find()) {
    	   
         count++;
         System.out.println("found the text "+m.group());
         System.out.println("Match number "+count);
         System.out.println("start(): "+m.start());
         System.out.println("end(): "+m.end());
       
      
      }
   }
    
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
    
    
}