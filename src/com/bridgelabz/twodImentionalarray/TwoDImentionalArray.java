package com.bridgelabz.twodImentionalarray;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDImentionalArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][]  array = new int[3][3];
		
		for(int i=0 ; i<array.length ; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				System.out.println("Enter the value ");
				array[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		System.out.println("Your Entered Values are : ");
		PrintWriter pw = new PrintWriter(System.out);
		for(int i=0 ; i<array.length ; i++)
		{
			for (int j = 0; j < array.length; j++) 
			{
				pw.print(array[i][j]+" ");
				pw.flush();
			}
		}
	}
}
