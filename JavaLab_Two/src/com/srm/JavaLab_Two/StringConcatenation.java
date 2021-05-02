package com.srm.JavaLab_Two;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Concatenating Two Strings : ");
		System.out.println("Enter the String 1:");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2:");
		String str2=sc.nextLine();
		String con=str1+str2;
		System.out.println("Concatenated String: "+con);

	}

}
