package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class IntToString {
	static Logger log=Logger.getLogger(IntToString.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Coversion of Integer to String...");
		log.info("Enter Signed Integer Value:");
		var val=sc.nextInt();
		var str1=Integer.toString(val);
		log.info("Converted String Value : "+str1);
		sc.close();
	}

}
