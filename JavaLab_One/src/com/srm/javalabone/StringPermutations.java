package com.srm.javalabone;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.Scanner;

public class StringPermutations {
	static Logger log=Logger.getLogger(StringPermutations.class.getName());
	  public static Set<String> calcPermutation(String str) {
		    Set<String> permutations = new HashSet<>();
		    if (str == null) {
		      return permutations;
		    } else if (str.length() == 0) {
		      permutations.add("");
		      return permutations;
		    }
		    var first = str.charAt(0);
		    var sub = str.substring(1);
		    Set<String> words =calcPermutation(sub);
		    for (String strNew : words) {
		      for (var i = 0;i<=strNew.length();i++){
		        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
		      }
		    }
		    return permutations;
		  }


	public static void main(String[] args) {
		var sc= new Scanner(System.in);
	    log.info("Enter the string: ");
	    String data = sc.nextLine();
	    log.info("Permutations of " + data + ": \n" + calcPermutation(data));
	    sc.close();
	    }

	}

