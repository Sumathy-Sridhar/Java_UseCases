package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
	static Logger log=Logger.getLogger(ReverseString.class.getName());
	static void reverseStr(String org) {
		var rev=new StringBuilder();
		char ch[]=org.toCharArray();
		var reverse="";
		for(int i=ch.length-1;i>0;i--) {
			rev=rev.append(ch[i]);
		}
		log.info("Reversal of " + org + " is "+ reverse);
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("String Reversal...");
		log.info("Enter string to reverse : ");
		String org=sc.nextLine();
		reverseStr(org);
		sc.close();
	}

}
