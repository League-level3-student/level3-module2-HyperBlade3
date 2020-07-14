package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test = {"a", "b", "c", "d", "e", "f", "g"};
		int loc = _00_LinearSearch.linearSearch(test, "d");
		assertEquals(loc, 3);
		
		loc = _00_LinearSearch.linearSearch(test, "g");
		assertEquals(loc, 6);
		
		loc = _00_LinearSearch.linearSearch(test, "a");
		assertEquals(loc, 0);
		
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int loc = _01_BinarySearch.binarySearch(test, 0, test.length, 7);
		assertEquals(loc, 6);
		
		loc = _01_BinarySearch.binarySearch(test, 0, test.length, 1);
		assertEquals(loc, 0);
		
		loc = _01_BinarySearch.binarySearch(test, 0, test.length, 10);
		assertEquals(loc, 9);
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		
		int[] test = {1, 2, 3, 4, 5, 6};		
		
		int loc = _02_InterpolationSearch.interpolationSearch(test, 5);
		assertEquals(loc, 4);
		
		loc = _02_InterpolationSearch.interpolationSearch(test, 1);
		assertEquals(loc, 0);
		
		loc = _02_InterpolationSearch.interpolationSearch(test, 8);
		assertEquals(loc, -1);
		
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};		
		
		int loc = _03_ExponentialSearch.exponentialSearch(test, 13);
		assertEquals(loc, 12);
		
		loc = _03_ExponentialSearch.exponentialSearch(test, 1);
		assertEquals(loc, 0);
		
		loc = _03_ExponentialSearch.exponentialSearch(test, 21);
		assertEquals(loc, -1);
		
		
		
		
				
		
		
		
		
		
		
		
		
		
	}
}
