package com.srm.javalab_one;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		int r1,c1,r2,c2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        r1= sc.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        c1= sc.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        r2= sc.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        c2= sc.nextInt();
        if (r1 == r2 && c1 == c2) 
        {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r2][c2];
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    for (int k = 0; k < c1; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }

}