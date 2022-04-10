import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Denominations {

	public static void main(String[] args) {

		//int[] array = { 45, 23, 6, 12, 87, 34, 66, 1 };
		//System.out.println(Arrays.toString(bubbleSort(array)));

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

		//Arrays.sort(arr);
		arr = bubbleSort(arr);

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

		for (int i = 0; i < hm.size(); i++) {
			System.out.println(denoms.get(i) + " : " + hm.get(denoms.get(i)));
		}

		sc.close();
	}

	public static int[] bubbleSort(int[] arr) {
		int len = arr.length;
		for (int k = 0; k < len - 1; k++) {
			for (int i = 0; i < len - 1; i++) {
				int j = i + 1;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

}
