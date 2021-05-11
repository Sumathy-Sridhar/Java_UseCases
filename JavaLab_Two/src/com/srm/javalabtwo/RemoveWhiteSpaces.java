package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveWhiteSpaces {
	static Logger log=Logger.getLogger(RemoveWhiteSpaces.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Removing whitespaces from the String...");
		log.info("Enter the String:");
		String str=sc.nextLine();
        str = str.replaceAll("\\s", "");
        log.info("After Removing Whitespaces : "+str);
        sc.close();
	}

}
