package com.srm.JavaLab_Two;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 FileReader fr =
			      new FileReader("C:\\Users\\Admin\\Desktop\\Demo.txt");
			    int i;
			    while ((i=fr.read()) != -1)
			      System.out.print((char) i);
			  }
	}

