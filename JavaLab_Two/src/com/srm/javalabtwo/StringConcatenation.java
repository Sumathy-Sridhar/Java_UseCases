package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringConcatenation {
	static Logger log=Logger.getLogger(StringConcatenation.class.getName());
	public static void main(String[] args) {
	
		var sc=new Scanner(System.in);
		log.info("Concatenating Two Strings : ");
		log.info("Enter the String 1:");
		String str1=sc.nextLine();
		log.info("Enter the String 2:");
		String str2=sc.nextLine();
		String con=str1+str2;
		log.info("Concatenated String: "+con);
		sc.close();
	}

}
