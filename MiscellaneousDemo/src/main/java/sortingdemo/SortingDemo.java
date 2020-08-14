package sortingdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {

	public static void main(String[] args) {
		//int array
		int[] intArray = {4,6,2,9,5,1,3};
		Arrays.sort(intArray);
		for(int i : intArray) {
			System.out.println("intArray sorted : "+i);
		}		
		
		//String array
		String[] strArray = {"Mumbai","Delhi","Pune","Kolkata","Chennai","Hyderabad","Bangalore"};
		Arrays.sort(strArray);
		for(String str : strArray) {
			System.out.println("String array sorted : "+str);
		}
		Arrays.sort(strArray, Collections.reverseOrder());
		for(String str : strArray) {
			System.out.println("String array sorted reversed : "+str);
		}
		
		//ArrayList
		ArrayList<Integer> list = new ArrayList();
		list.add(23);
		list.add(45);
		list.add(87);
		list.add(96);
		list.add(34);
		Collections.sort(list);
		System.out.println("List sorted : "+list.toString());
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List sorted reveresed : "+list.toString());
		list.sort(Collections.reverseOrder());
		System.out.println("List sorted reveresed : "+list.toString());
		List<Object> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("List sorted : "+list1.toString());
		List<Object> list2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("List sorted : "+list2.toString());
	}

}
