package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class VowelsCount {
	static Logger log=Logger.getLogger(VowelsCount.class.getName());
	static void countVowels(String inputString) {
		var countvow=0;
	      for (var iter=0 ; iter<inputString.length(); iter++){
		         var ch = inputString.charAt(iter);
		         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		            countvow ++;
		         }
		      }
		      log.info("Number of vowels is "+countvow);
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Finding the Count of Vowels in the String...");
		log.info("Enter the String:");
		var inputString=sc.nextLine();
		countVowels(inputString);
		sc.close();
	}

}
