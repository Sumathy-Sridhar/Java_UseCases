package com.srm.JavaLab_Two;
import java.util.Scanner;
public class UpperLowercase {
	static void upperLower(String str) {
		for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123)
            {
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32) 
            	System.out.print(" ");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding number of words in the String...");
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		upperLower(str);
	}

}
