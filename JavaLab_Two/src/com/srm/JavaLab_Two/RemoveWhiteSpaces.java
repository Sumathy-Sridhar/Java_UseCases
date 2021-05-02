package com.srm.JavaLab_Two;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Removing whitespaces from the String...");
		System.out.println("Enter the String:");
		String str=sc.nextLine();
        str = str.replaceAll("\\s", "");
        System.out.println("After Removing Whitespaces : "+str);
	}

}
