package com.bridgelabz.harmonicnumber;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value Of till of which you what to  find harmonic number ");
		int n = scanner.nextInt();
		scanner.close();
		double harmonicNumber = 0.0 ;
		if (0 < n )
		{
			for(double i= 1 ;i<=n ; i++) 
			{

				harmonicNumber = harmonicNumber + ( 1 / i ) ;
			}
			System.out.println("The "+n+" harmonic number is  " + harmonicNumber);
		}

		else
		{
			System.out.println("Enter value is Not valid");
		}
	}
}
