package com.srm.javalab_one;

import java.util.Scanner;

public class ReverseStringMethod {
	public static String rev(String str){
		return new StringBuilder(str).reverse().toString();
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String Reversal using reverse method...");
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		String s;
		s=str;
		str=rev(str);
		System.out.println("Reverse of "+ s+ " is "+ str);
	}

}
