package com.bridgelabz.windchill;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WindChill 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temparature : ");
		double t = scanner.nextInt();
		System.out.println("Enter Wind Speed : ");
		double v = scanner.nextInt();
		scanner.close();
		double windSpeed = 35.74 + (0.6215 * t) + ((0.4275*t - 35.75) * Math.pow(v,0.16));
		windSpeed = Double.parseDouble(new DecimalFormat("##.##").format(windSpeed));
		System.out.println("Wind Chill : "+windSpeed);
	}

}
