package com.bridgelabz.powerOf2;

import java.util.Scanner;

public class Power_Of_2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value Of till which you have to print table of power 2 ");
		int N = scanner.nextInt();
		scanner.close();
		
		if (0 <= N && N <= 31)
		{
			for(int i=1 ;i<=N ; i++) 
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
