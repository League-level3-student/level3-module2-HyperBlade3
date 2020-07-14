package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);

		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] a = {1, 6, 2, 6, 2, 3, 8, 0};
		int[] b = {2, 3, 5, 7, 9};
		
		assertArrayEquals(b, a);
		
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		for (int j  = 0; j < arr.length; j++) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
		}}
	}
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int index = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			
			}
			int temp = array[i];
			array[i]  = array[index];
			array[index] = temp;
			
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	
	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		if (arr.length % 2 == 1) {
			int x = (int) Math.ceil(arr.length / 2);
			return arr[(int) x];
		} else {
			int x1 = (int) Math.floor(arr.length / 2);
			int x2 = (int) Math.ceil(arr.length/2);
			
			double x = (x1 + x2)/2;
			
			return (int) x;
		}
		
	}
}
