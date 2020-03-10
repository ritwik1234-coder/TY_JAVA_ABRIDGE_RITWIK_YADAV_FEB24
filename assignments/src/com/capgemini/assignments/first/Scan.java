package com.capgemini.assignments.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter name");
			break;
		case 2:
			System.out.println("Enter age");
			break;
		case 3:
			System.out.println("Enter address");
			break;
		case 4:
			System.out.println("Enter phone numer");
			break;
		case 5:
			System.out.println("Enter email");
			break;
		default:
			System.out.println("invalid");

		}
	}

}
