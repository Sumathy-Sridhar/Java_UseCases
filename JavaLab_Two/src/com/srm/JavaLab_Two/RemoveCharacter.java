package com.srm.JavaLab_Two;

import java.util.Scanner;

public class RemoveCharacter {
		static void removeChar(String input,int index) {
            System.out.println(input.substring(0, index) + input.substring(index + 1));  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Removing specific character in the String...");
		System.out.println("Enter the String:");
		String input=sc.nextLine();
		System.out.println("Enter the Index of character to remove : ");
		int index=sc.nextInt();
		removeChar(input, index);
	}

}
