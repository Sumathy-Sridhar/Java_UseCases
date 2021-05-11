package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class UniqueCharacters {
	static Logger log=Logger.getLogger(UniqueCharacters.class.getName());
	static void chkUnique(String str) {
		var count=0;
	
		for (var i = 0; i < str.length(); i++)
		{
            for (var j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) ==str.charAt(j))
                {
                	count++;
                }
            }
		}
		if(count>0) {
			log.info(str+ " has duplicate characters.");
		}
		else {
			log.info(str+ " has unique characters.");
		}
	}

	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Finding Unique Characters in the String...");
		log.info("Enter the String:");
		String str=sc.nextLine();
		chkUnique(str);
		sc.close();
	}

}
