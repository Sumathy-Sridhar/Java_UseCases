package com.srm.javalabtwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Logger;

public class CountCharacter {
	static Logger log=Logger.getLogger(CountCharacter.class.getName());
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
            	charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
            	charCountMap.put(c, 1);
            }
        }
        for (Iterator<Entry<Character, Integer>> iterator = charCountMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<Character, Integer> entry = iterator.next();
			log.info(entry.getKey() + " " + entry.getValue());
		}
    }
    public static void main(String[] args) {
	
		var sc=new Scanner(System.in);
		log.info("Finding Occurence of character in the String...");
		log.info("Enter the String:");
		var inputString=sc.nextLine();
		characterCount(inputString);
		sc.close();
	}

}
