package com.bridgelabz.quadratic;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a,b & c to find quadratic roots");
		System.out.println("Enter the value of a ");
		int a = scanner.nextInt();
		System.out.println("Enter the value of b ");
		int b = scanner.nextInt();		
		System.out.println("Enter the value of c ");
		int c = scanner.nextInt();
		scanner.close();
		double delta = (b*b) - (4*a*c);
		double Root1 = (-b + Math.sqrt(delta)) / (2*a) ;
		double Root2 = (-b - Math.sqrt(delta)) / (2*a) ;
		System.out.println("Required Roots are "+Root1+" & "+Root2);
	}

}
