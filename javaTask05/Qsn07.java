package javaTask05;

import java.util.Scanner;

public class Qsn07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :: ");
		int num2 = sc.nextInt();
		System.out.println("Enter thirs number :: ");
		int num3 = sc.nextInt();
		if (num1>num2 && num1>num3) {
			System.out.println(num1 + " Num 1 is largest number");
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " Num 2 is largest number");
		}
		else {
			System.out.println(num3 + " Num 3 is largest number");
		}

	}

}
