package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;
public class MatrixAddition {
	static Logger log=Logger.getLogger(MatrixAddition.class.getName());
	public static void main(String[] args) {
		int r1;
		int r2;
		int c1;
		int c2;
        var sc= new Scanner(System.in);
        log.info("Enter number of rows in first matrix:");
        r1= sc.nextInt();
        log.info("Enter number of columns in first matrix:");
        c1= sc.nextInt();
        log.info("Enter number of rows in second matrix:");
        r2= sc.nextInt();
        log.info("Enter number of columns in second matrix:");
        c2= sc.nextInt();
        if (r1 == r2 && c1 == c2) 
        {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r2][c2];
            log.info("Enter elements of first matrix:");
            for (var i = 0; i < r1; i++) 
            {
                for (var j = 0; j < c1; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            log.info("Enter elements of second matrix:");
            for (var i = 0; i < r2; i++) 
            {
                for (var j = 0; j < c2; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            for (var i = 0; i < r1; i++) 
            {
                for (var j = 0; j < c2; j++) 
                {
                    for (var k = 0; k < c1; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            log.info("Matrix after addition:");
            for (var i = 0; i < r1; i++) 
            {
                for (var j = 0; j < c2; j++) 
                {
                    log.info(c[i][j]+" ");
                }
                log.info("");
            }
        }
        else
        {
            log.info("Addition would not be possible");
        }
        sc.close();
    }

}