package com.srm.javalabtwo;
import java.util.Scanner;
import java.util.logging.Logger;
public class UpperLowercase {
	static Logger log=Logger.getLogger(UpperLowercase.class.getName());
	static void upperLower(String str) {
		for(var i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                log.info( (char) ch + "");
            }
            else if(ch>96&&ch<123)
            {
                ch=ch-32;
                log.info( (char) ch + " ");
            }
            if(ch==32) 
            	log.info(" ");
        }
	}

	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Finding number of words in the String...");
		log.info("Enter the String:");
		String str=sc.nextLine();
		upperLower(str);
		sc.close();
	}

}
