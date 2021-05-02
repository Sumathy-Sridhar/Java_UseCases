package com.srm.JavaLab_Two;

import java.util.Scanner;

public class CountWords {
	static void countWords(String str) {
		int count=0;
		 for (int i = 0;i<=(str.length()-1);i++)
	   	 {
	    	if(  ( (i>0)&& (str.charAt(i)!=' ') &&(str.charAt(i-1)==' ')) ||
	    			((str.charAt(i)!=' ')&&(i==0)) )
	          	  count++;    
	   	 }
	               System.out.println("number of words in a given string is :"+count);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding number of words in the String...");
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		countWords(str);
	}

}
