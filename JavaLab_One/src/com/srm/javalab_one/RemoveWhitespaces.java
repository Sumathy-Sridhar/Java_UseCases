package com.srm.javalab_one;

import java.util.Scanner;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Removing WhiteSpaces...");
		System.out.println("Enter String : ");
		String str=sc.nextLine();
	      System.out.print("Replaced String :" );
	      System.out.println(str.replaceAll(" ", ""));


	}

}
