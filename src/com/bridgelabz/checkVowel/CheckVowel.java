package com.bridgelabz.checkvowel;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the  Alphabet to check weather its  vowel or not");
		char alphabet = scanner.next().charAt(0);
		scanner.close();	
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') 
		{
			System.out.println("Its an Vowel");
		}
		else 
		{			
			System.out.println("Its a Consonant");
		}
	}
}
