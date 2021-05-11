package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class DataTypeRange {
	static Logger log=Logger.getLogger(DataTypeRange.class.getName());
	static void minmaxRange(String dataType) {
		switch(dataType) {
		case "Integer": 	     
			log.info("Min range of Integer = " + Integer.MIN_VALUE);
			log.info("Max range of integer= " + Integer.MAX_VALUE);
			break;
		case "Float":
		      log.info("Min range of Float = " + Float.MIN_VALUE);
		      log.info("Max range of float = " + Float.MAX_VALUE);
		      break;
		case "Double":
		      log.info("Min range of Double = " + Double.MIN_VALUE);
		      log.info("Max range of Double = " + Double.MAX_VALUE);
		      break;
		case "Byte":
			  log.info("Min range of Byte = " + Byte.MIN_VALUE);
		      log.info("Max range of Byte= " + Byte.MAX_VALUE);
		      break;
		case "Short":
		      log.info("Min range of short = " + Short.MIN_VALUE);
		      log.info("Max range of short = " + Short.MAX_VALUE);
		      break;
		default:
			log.info("Invalid Datatype...");
		}
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Finding Min Max Range of given DataType...");
		log.info("Enter the DataType:");
		String dataType=sc.nextLine();
		minmaxRange(dataType);
		sc.close();
	}

}
