package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveWhitespaces {
	static Logger log=Logger.getLogger(RemoveWhitespaces.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Removing WhiteSpaces...");
		log.info("Enter String : ");
		String str=sc.nextLine();
	      log.info("Replaced String :" );
	      log.info(str.replace(" ", ""));
	      sc.close();


	}

}
