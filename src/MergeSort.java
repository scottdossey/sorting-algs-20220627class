import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class MergeSort {
	

	static <T extends Comparable<T>> List<T> merge(List<T> firstHalf, List<T> secondHalf) {
		//So the first thing we need is need an array of T to store our merged result
		int index1 = 0;
		int index2 = 0;
		ArrayList<T> newList=new ArrayList<>();
		while(index1 < firstHalf.size() && index2 < secondHalf.size()) {
			T item1 = firstHalf.get(index1);
			T item2 = secondHalf.get(index2);
			if(item1.compareTo(item2) <= 0) {
				newList.add(item1);
				index1+=1;
			} else {
				newList.add(item2);
				index2+=1;
			}			
		}
		while(index1 < firstHalf.size()) {
			T item1 = firstHalf.get(index1++);
			newList.add(item1);
		}
		
		while(index2 < secondHalf.size()) {
			T item2 = secondHalf.get(index2++);
			newList.add(item2);
		}
		return newList;
	}
	
	static <T extends Comparable<T>> List<T> sort(List<T> list) {
		if (list.size() <= 1) {
			return list;
		}
		int midPoint = list.size()/2;
		List<T> firstHalf = sort(list.subList(0, midPoint));
		List<T> secondHalf = sort(list.subList(midPoint, list.size()));		
		return merge(firstHalf, secondHalf);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> myNumbers = Arrays.asList(new Integer[] { 5, 7, -1, 4, 12, 15, 3 });
		List<Integer> sortedList = sort(myNumbers);
		System.out.println(sortedList);
	}

}
