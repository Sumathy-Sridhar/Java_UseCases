package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberToWord {
	static Logger log=Logger.getLogger(NumberToWord.class.getName());
	static void numberToWords(char[] num)  
	{    
	int len = num.length;    
	if (len == 0)   
	{       
	log.info("The string is empty.");  
	return;  
	}    
	if (len > 4)   
	{      
	log.info("\n The given number has more than 4 digits.");  
	return;  
	}      
	var onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};         
	var  twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
	var multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
	var poweroftens = new String[] {"Hundred", "Thousand"};    
	log.info(String.valueOf(num) + ": ");    
	if (len == 1)   
	{    
	log.info(onedigit[num[0]-'0']);  
	return;  
	}  
	var x = 0;    
	while (x < num.length)   
	{    
	if (len >= 3)   
	{  
	if (num[x] - '0' != 0)   
	{  
	log.info(onedigit[num[x] - '0'] + " ");    
	log.info(poweroftens[len - 3]+ " ");  
	}    
	--len;  
	}    
	else   
	{       
	if (num[x] - '0' == 1)   
	{    
	int sum = num[x] - '0' + num[x + 1] - '0';  
	log.info(twodigits[sum]);  
	return;  
	}    
	else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
	{      
		log.info("Twenty");  
		return;  
	}    
	else   
		{  
		int i = (num[x] - '0');  
		if (i > 0)    
			log.info(multipleoftens[i]+ " ");  
		else  {  
			log.info("");  
			++x;}  
	if (num[x] - '0' != 0)  
		log.info(onedigit[num[x] - '0']);  
	}  
	}  
	++x;  
	}  
	}  


	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Coversion of Math number to readable word...");
		numberToWords("75".toCharArray());  
		numberToWords("0".toCharArray());  
		numberToWords("8".toCharArray());  
		numberToWords("100".toCharArray());
		sc.close();
		
	}

}
