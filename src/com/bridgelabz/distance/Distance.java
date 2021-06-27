package com.bridgelabz.distance;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of X");
		int x = scanner.nextInt();
		System.out.println("Enter the value of Y");
		int y = scanner.nextInt();
		scanner.close();
		double Distance = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
		System.out.println("Distance is "+ Distance);
	}
}
