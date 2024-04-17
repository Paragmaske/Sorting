package com.main.sort.All;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {23,5,10,1,2};
		int n = a.length;
		
		for (int i = 1; i < a.length; i++) {
		    int current = a[i];
		    int j = i - 1;
		    while (j >= 0 && a[j] > current) {
		        a[j + 1] = a[j];
		        j--;
		    }
		    a[j + 1] = current;
		}


		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
}
