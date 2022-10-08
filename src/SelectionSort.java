
public class SelectionSort {
	static <T extends Comparable<T>> void sort(T[] array) {
		
		/* Outer loop is going to increase the size of our
		 * sorted part of the list each step through;
		 */
		for(int i=0; i<array.length-1; ++i) {
			/* Scan the remained of the array for the lowest item */
			int minimumIndex = i+1;			
			for(int j=i+2; j<array.length; ++j) {
				if(array[j].compareTo(array[minimumIndex])<0) {
					minimumIndex = j;
				}
			}
			//Swap i and minimumIndex
			T temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
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
