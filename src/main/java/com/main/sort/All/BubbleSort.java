package com.main.sort.All;

public class BubbleSort {

	public static int[] sortedArray(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped) {
				System.out.println(isSwapped);
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 0, 11, 45, -9 };
		int[] a = sortedArray(arr);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
