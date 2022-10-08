
public class InsertionSort {
	static <T extends Comparable<T>> void sort(T[] array) {			
		/* Outer loop is going to increase the size of our
		 * sorted part of the list each step through;
		 */
		for(int i=1; i<array.length; ++i) {
			//Everything to the left of i as we advance i will be sorted.
			T item = array[i];
			//Now we have to figure out where to place the next item.
			int compareIndex = i-1;
			while(compareIndex >= 0 && (array[compareIndex].compareTo(item)> 0)) {
				//Move the element at compareIndex one over.
				array[compareIndex+1] = array[compareIndex];
				compareIndex -= 1;
			}
			array[compareIndex+1] = item;
		}
	}
	
	public static void main(String[] args) {
		Integer[] myNumbers = { 5, 7, -1, 4, 12, 15, 3 };
		sort(myNumbers);
		for(Integer x: myNumbers) {
			System.out.println(x);
		}
	}
}
