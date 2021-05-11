package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class FirstNonRepeating {
	static Logger log=Logger.getLogger(FirstNonRepeating.class.getName());
	static void firstNonRepeat(String str) {
		for (var i = 0; i < str.length(); i++) {
			   var unique = true;
			   for (var j = 0; j < str.length(); j++) {
			    if (i != j && str.charAt(i) == str.charAt(j)) {
			     unique = false;
			     break;
			    }
			   }
			   if (unique) {
			    log.info("The first non repeated character in String is: " + str.charAt(i));
			    break;
			   }
			  }
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Finding First Non-Repeated Character in the String : ");
		log.info("Enter the String: ");
		String str=sc.nextLine();
		firstNonRepeat(str);
		sc.close();
	}

}
