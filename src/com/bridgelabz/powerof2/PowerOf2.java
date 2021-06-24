package com.bridgelabz.powerof2;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value Of till which you have to print table of power 2 ");
		int n = scanner.nextInt();
		scanner.close();

		if (0 <= n && n <= 31)
		{
			System.out.println("The table for first "+n+" elements");
			for(int i=1 ;i<=n ; i++) 
			{
				System.out.println((int)Math.pow(2, i));
			}
		}

		else
		{
			System.out.println("Enter value is Not valid");
		}
	}

}
