package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveCharacter {
	static Logger log=Logger.getLogger(RemoveCharacter.class.getName());
		static void removeChar(String input,int index) {
            log.info(input.substring(0, index) + input.substring(index + 1));  
		}
	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Removing specific character in the String...");
		log.info("Enter the String:");
		String input=sc.nextLine();
		log.info("Enter the Index of character to remove : ");
		var index=sc.nextInt();
		removeChar(input, index);
		sc.close();
	}

}
