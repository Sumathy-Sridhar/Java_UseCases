package com.srm.javalab_one;

import java.util.Scanner;

public class ReverseString {
	static void reverseStr(String org) {
		char ch[]=org.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>0;i--) {
			reverse+=ch[i];
		}
		System.out.println("Reversal of " + org + " is "+ reverse);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String Reversal...");
		System.out.println("Enter string to reverse : ");
		String org=sc.nextLine();
		reverseStr(org);

	}

}
