package com.srm.javalabone;
import java.util.Arrays;
import java.util.logging.Logger;
public class Anagram {
	static Logger log=Logger.getLogger(Anagram.class.getName());
	void checkAnagram(String str1, String str2) {
		 String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        var status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] arrayS1 = s1.toLowerCase().toCharArray();  
	            char[] arrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(arrayS1);  
	            Arrays.sort(arrayS2);  
	            status = Arrays.equals(arrayS1, arrayS2);  
	        } 
	        if (status) {  
	            log.info("True");  
	        } else {  
	            log.info("False");  
	        }  
	    }  


	public static void main(String[] args) {
		var ag=new Anagram();
		ag.checkAnagram("The eyes", "They see");
		ag.checkAnagram("Brown","Cony");
		ag.checkAnagram("Listen","Silent");
	}

}
