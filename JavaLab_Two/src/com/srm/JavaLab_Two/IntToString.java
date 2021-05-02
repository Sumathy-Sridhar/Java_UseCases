package com.srm.JavaLab_Two;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Coversion of Integer to String...");
		System.out.println("Enter Signed Integer Value:");
		int val=sc.nextInt();
		String str1=Integer.toString(val);
		System.out.println("Converted String Value : "+str1);
	
	}

}
