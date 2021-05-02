package com.srm.javalab_one;

import java.util.Scanner;

public class Palindrome {

	static void chkPalindrome(String str) {
		int n=str.length();
		String rev="";
        for(int i = n - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str +" is a palindrome.");
        }
        else
        {
            System.out.println(str + " is not a palindrome.");
        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("String Palindrome...");
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		chkPalindrome(str);
	}

}
