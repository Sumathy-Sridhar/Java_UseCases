package com.srm.javalab_one;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class StringPermutations {
	  public static Set<String> calcPermutation(String str) {
		    Set<String> permutations = new HashSet<String>();
		    if (str == null) {
		      return null;
		    } else if (str.length() == 0) {
		      permutations.add("");
		      return permutations;
		    }
		    char first = str.charAt(0);
		    String sub = str.substring(1);
		    Set<String> words =calcPermutation(sub);
		    for (String strNew : words) {
		      for (int i = 0;i<=strNew.length();i++){
		        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
		      }
		    }
		    return permutations;
		  }


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String data = sc.nextLine();
	    System.out.println("Permutations of " + data + ": \n" + calcPermutation(data));
	    }

	}

