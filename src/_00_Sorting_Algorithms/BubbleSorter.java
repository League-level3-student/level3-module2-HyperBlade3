package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int j = 0; j < array.length; j++) {
			
			for (int i = 1; i < array.length; i++) {
				
				if (array[i] > array[i - 1]) {
					int temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;

				}
				
			}
			
			
		}
	}

}
