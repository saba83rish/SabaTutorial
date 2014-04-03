package org.saba.tutorial;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords
{


    public static void main( String args[] ) throws IOException{
       int count = 0;
       TreeMap<String,Integer> map = readFile("/comcast.txt");
       Set<Entry<String, Integer>> set = map.entrySet();
       List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
       Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
    	        {
    	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
    	            {
    	                return (o2.getValue()).compareTo( o1.getValue() );
    	            }
    	        } );
      System.out.println(list.toString());

   }
    
	private static TreeMap<String,Integer> readFile(String pathname) throws IOException {

		File file = new File(pathname);
		Scanner scanner = new Scanner(file);
		TreeMap<String,Integer> wordMap = new TreeMap<String,Integer>();

		try {
			while (scanner.hasNextLine()) {
			    Scanner scNewLine = new Scanner(scanner.nextLine());
	            //checks if next word is available from the text goes till the last word is fetched 
	            while (scNewLine.hasNext()) {
	            	
	            	String word = scNewLine.next();
	            	System.out.println("word-->"+word);
	            	if(wordMap.containsKey(word)){
	            		
	            		wordMap.put(word, wordMap.get(word)+1);
	            	} else {
	            		wordMap.put(word, 1);
	            	}
	            }
			}
			
			System.out.println(wordMap.toString());
			return wordMap;
		} finally {
			scanner.close();
		}
	}
    
    
}