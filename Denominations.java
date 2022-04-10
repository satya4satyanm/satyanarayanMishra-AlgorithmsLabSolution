package com.gl.satya4satyanm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Denominations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		System.out.println("Enter the currency denominations value one per line:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay:");
		int amountToPay = sc.nextInt();

		Arrays.sort(arr);

		int index = arr.length - 1;
		
		// used to print the denominations from higher to lower
		ArrayList<Integer> denoms = new ArrayList<Integer>();
		
		while (amountToPay > 0) {
			if (amountToPay >= arr[index]) {
				int noOfCurr = amountToPay / arr[index];
				amountToPay = amountToPay % arr[index];
				
				denoms.add(arr[index]);

				hm.put(arr[index], noOfCurr);
			}

			index--;
		}

		for(int i=0; i<hm.size(); i++) {
			System.out.println(denoms.get(i) + " : " + hm.get(denoms.get(i)));
		}

		sc.close();
	}

}
