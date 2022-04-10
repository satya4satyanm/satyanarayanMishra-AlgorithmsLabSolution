package com.gl.satya4satyanm;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the values of array each in a new line:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved:");
		int totalTargets = sc.nextInt();

		for (int i = 0; i < totalTargets; i++) {
			System.out.println("Enter the value of target:");
			int target = sc.nextInt();

			int x = countTransactions(target, arr);
			if (x > -1) {
				System.out.println("The target achieved after " + (x + 1) + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}

		}
		
		sc.close();

	}

	private static int countTransactions(int target, int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > target) {
				return i;
			}
		}

		return -1;
	}

}
