
//Bubblesort is easy to implement
//Strategy: We go through the array
//and we exchange out of order items that are 
//next to each other...

//We sweep through the array multiple times until
//no more exchanges are necessary.
public class BubbleSort {
	
	static <T extends Comparable<T>> void sort(T[] array) {			
		for (int sortLength = array.length-1; sortLength > 0; --sortLength) {		
			for( int i=0; i< sortLength; ++i) {						
				//Check two adjacent elements at i
				if(array[i].compareTo(array[i+1]) > 0) {			
					//Exchange two elements.
					T temporary = array[i];
					array[i] = array[i+1];
					array[i+1] = temporary;
				}			
			}
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
