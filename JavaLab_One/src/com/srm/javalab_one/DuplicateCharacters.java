package com.srm.javalab_one;

import java.util.Scanner;

public class DuplicateCharacters {
	static void duplicate(String str) {
        int count;     
        char string[] = str.toCharArray();  
       System.out.println("Duplicate characters in a given string: ");  
        
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                   
                    string[j] = '0';  
                }  
            }
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Identifying Duplicate Characters");
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		duplicate(str);
	}

}
