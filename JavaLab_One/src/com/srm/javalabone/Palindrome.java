package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;

public class Palindrome {
	static Logger log=Logger.getLogger(Palindrome.class.getName());
	static void chkPalindrome(String str) {
		int n=str.length();
		var rev=new StringBuilder();
        for(int i = n - 1; i >= 0; i--)
        {
           var ch=str.charAt(i);
           rev=rev.append(ch);
          
        }
       
        if(str.equals(rev))
        {
            log.info(str +" is a palindrome.");
        }
        else
        {
            log.info(str + " is not a palindrome.");
        }

	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("String Palindrome...");
		log.info("Enter the String : ");
		String str=sc.nextLine();
		chkPalindrome(str);
		sc.close();
	}

}
