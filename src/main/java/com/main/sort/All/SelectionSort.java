package com.main.sort.All;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 12, 10, -15, 2 };
		int[] a = sortedArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static int[] sortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int min = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = min;

		}
		return arr;
	}
}
