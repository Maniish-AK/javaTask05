package javaTask05;

import java.util.Scanner;

public class Qsn01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0, temp;
		System.out.print("Enter your number :: ");
		int num = sc.nextInt();
		temp = num;
		while (num != 0) {
			i = num % 10;
			sum = (sum * 10) + i;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is Palindrome Number");
		}
		else {
			System.out.println(temp + " is not Palindrome Number");
		}

	}

}
