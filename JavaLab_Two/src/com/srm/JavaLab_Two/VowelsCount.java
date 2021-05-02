package com.srm.JavaLab_Two;

import java.util.Scanner;

public class VowelsCount {
	static void countVowels(String inputString) {
		int countvow=0;
	      for (int iter=0 ; iter<inputString.length(); iter++){
		         char ch = inputString.charAt(iter);
		         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		            countvow ++;
		         }
		      }
		      System.out.println("Number of vowels is "+countvow);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding the Count of Vowels in the String...");
		System.out.println("Enter the String:");
		String inputString=sc.nextLine();
		countVowels(inputString);
	}

}
