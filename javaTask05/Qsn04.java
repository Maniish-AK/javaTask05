package javaTask05;

import java.util.Scanner;

public class Qsn04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n / 2 - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

