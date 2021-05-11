package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class CountWords {
	static Logger log=Logger.getLogger(CountWords.class.getName());
	static void countWords(String str) {
		var count=0;
		 for (var i = 0;i<=(str.length()-1);i++)
	   	 {
	    	if(  ( (i>0)&& (str.charAt(i)!=' ') &&(str.charAt(i-1)==' ')) ||
	    			((str.charAt(i)!=' ')&&(i==0)) )
	          	  count++;    
	   	 }
	               log.info("number of words in a given string is :"+count);
	   }

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Finding number of words in the String...");
		log.info("Enter the String:");
		String str=sc.nextLine();
		countWords(str);
		sc.close();
	}

}
