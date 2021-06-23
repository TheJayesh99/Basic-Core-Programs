package com.bridgelabz.harmonicNumber;

import java.util.Scanner;

public class harmonic_number {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value Of till which you have to print table of power 2 ");
		int N = scanner.nextInt();
		scanner.close();
		double harmonicNumber = 0.0 ;
		if (0 < N && N <= 31)
		{
			for(double i= 1 ;i<=N ; i++) 
			{
				
				harmonicNumber = harmonicNumber + ( 1 / i ) ;
			}
			System.out.println("The "+N+" harmonic number is  " + harmonicNumber);
		}
		
		else
		{
			System.out.println("Enter value is Not valid");
		}
	}
}
