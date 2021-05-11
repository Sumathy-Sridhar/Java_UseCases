package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseStringMethod {
	static Logger log=Logger.getLogger(ReverseStringMethod.class.getName());
	public static String rev(String str){
		return new StringBuilder(str).reverse().toString();
		}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("String Reversal using reverse method...");
		log.info("Enter the string :");
		String str=sc.nextLine();
		String s;
		s=str;
		str=rev(str);
		log.info("Reverse of "+ s+ " is "+ str);
		sc.close();
	}

}
