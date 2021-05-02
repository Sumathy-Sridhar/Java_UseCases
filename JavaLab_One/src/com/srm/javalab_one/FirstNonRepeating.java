package com.srm.javalab_one;

import java.util.Scanner;

public class FirstNonRepeating {
	static void firstNonRepeat(String str) {
		for (int i = 0; i < str.length(); i++) {
			   boolean unique = true;
			   for (int j = 0; j < str.length(); j++) {
			    if (i != j && str.charAt(i) == str.charAt(j)) {
			     unique = false;
			     break;
			    }
			   }
			   if (unique) {
			    System.out.println("The first non repeated character in String is: " + str.charAt(i));
			    break;
			   }
			  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding First Non-Repeated Character in the String : ");
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		firstNonRepeat(str);

	}

}
