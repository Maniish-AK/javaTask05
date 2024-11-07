package javaTask05;

import java.util.Scanner;

public class Qsn02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :: ");
		String word = sc.nextLine();
		String reverseString = "";
		for (int i = word.length() - 1; i>=0; i--) {
			reverseString = reverseString + word.charAt(i); 
		}
		System.out.println("Reversed Strind is :: " + reverseString);

	}

}
