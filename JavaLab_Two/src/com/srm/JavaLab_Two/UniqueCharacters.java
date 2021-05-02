package com.srm.JavaLab_Two;

import java.util.Scanner;

public class UniqueCharacters {
	static void chkUnique(String str) {
		int count=0;
	
		for (int i = 0; i < str.length(); i++)
		{
            for (int j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) ==str.charAt(j))
                {
                	count++;
                }
            }
		}
		if(count>0) {
			System.out.println(str+ " has duplicate characters.");
		}
		else {
			System.out.println(str+ " has unique characters.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding Unique Characters in the String...");
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		chkUnique(str);
	}

}
