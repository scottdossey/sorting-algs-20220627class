
public class QuickSort {
	
	static <T extends Comparable<T>> void innerSort(T[] array, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		//partition doesn't always split the array equally into two halves.
		//in fact it can't do any better than selecting an item from the array
		//and hoping that item is in the middle.
		//A very common implementation of quicksort is to select either
		//the first element (or the last element) as the partitioning element.
		
		//If we select either the first element or last element and we have already
		//nearly sorted data--we will select a pivot that is TERRIBLE for dividing
		//the list in half. In fact one half will be 0 length length long, and the 
		//other half will be the rest of the array minus the pivot item.
		
		//This means that Quicksort with a bad pivot selection every time will
		// run in O(n^2) time. With good pivots it will run in O(n log n)
		//And for the common case of a pivot that is selected at the beginning or end
		//The worst case data for Quicksort to sort is ALREADY SORTED DATA.
		
		
		int partitionIndex = partition(array, lowIndex, highIndex);
		innerSort(array, lowIndex, partitionIndex);
		innerSort(array, partitionIndex+1, highIndex);
	}
	
	static <T extends Comparable<T>> void sort(T[] array) {			
		innerSort(array, 0, array.length);
	}
	
	public static void main(String[] args) {
		Integer[] myNumbers = { 5, 7, -1, 4, 12, 15, 3 };
		sort(myNumbers);
		for(Integer x: myNumbers) {
			System.out.println(x);
		}
	}
}
