package com.srm.javalabtwo;
import java.io.FileReader;
import java.util.logging.Logger;

public class ReadFile {
	static Logger log=Logger.getLogger(ReadFile.class.getName());
	public static void main(String[] args) throws Exception {
		var path="C:\\Users\\Admin\\Desktop\\Demo.txt";
		 var fr =new FileReader(path);
			    int i;
			    while ((i=fr.read()) != -1) {
			      log.info((char) i+ " ");
			  } fr.close();
	}
	}

