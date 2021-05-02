package com.srm.JavaLab_Two;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
            	charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
            	charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding Occurence of character in the String...");
		System.out.println("Enter the String:");
		String inputString=sc.nextLine();
		characterCount(inputString);
		
	}

}
