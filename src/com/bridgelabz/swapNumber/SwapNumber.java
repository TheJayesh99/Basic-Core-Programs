package com.bridgelabz.swapNumber;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value 1st number ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the value 2nd number ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("Before Swaping");
		System.out.println("The Number 1 = "+num1);
		System.out.println("The Number 2 = "+num2);

		int temp = num1 ;
		num1 = num2 ;
		num2 = temp ;
		
		System.out.println("\n After swaping");
		System.out.println("The Number 1 = "+num1);
		System.out.println("The Number 2 = "+num2);
	}

}
