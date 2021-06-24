package com.bridgelabz.primefactors;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number Whose prime factors is to Find  ");
		int number = scanner.nextInt();
		scanner.close();

		System.out.println("The factors are");

		for(int i=2 ; i<=number ;i++)
		{
			int is_prime = 0;
			//checking taken number is prime 
			for (int j = 2 ; j<i ;j++ )
			{
				int remainder = i % j ;
				if (remainder == 0)
				{
					is_prime ++ ;
				}


			}

			if (is_prime == 0)
			{
				//finding the factorial using above prime numbers
				while ((number % i) == 0)
				{

					System.out.println(i);
					number = number/i;
				}
			}
		}
	}
}
