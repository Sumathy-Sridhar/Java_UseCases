package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class DuplicateCharacters {
	static Logger log=Logger.getLogger(DuplicateCharacters.class.getName());
	static void duplicate(String str) {
        int count;     
        char[] string = str.toCharArray();  
       log.info("Duplicate characters in a given string: ");  
        for(var i = 0; i <string.length; i++) {  
            count = 1;  
            for(var j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                   
                    string[j] = '0';  
                }  
            }
            if(count > 1 && string[i] != '0')  
                log.info(string[i] + " ");  
        }  
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Identifying Duplicate Characters");
		log.info("Enter String : ");
		String str=sc.nextLine();
		duplicate(str);
		sc.close();
	}

}
