package com.srm.javalab_one;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	void checkAnagram(String str1, String str2) {
		 String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println("True");  
	        } else {  
	            System.out.println("False");  
	        }  
	    }  


	public static void main(String[] args) {
		Anagram ag=new Anagram();
		ag.checkAnagram("The eyes", "They see");
		ag.checkAnagram("Brown","Cony");
		ag.checkAnagram("Listen","Silent");
	}

}
