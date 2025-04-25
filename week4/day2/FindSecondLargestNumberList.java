package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Array ={3, 2, 11, 4, 6, 7};
		
		//change arraytoList
		List<Integer> List = new ArrayList<>(Arrays.asList(Array));
		System.out.println(List);
		Collections.sort(List);
		System.out.println("List after sorting is:"+List);
		Integer secondlargestelement = List.get(List.size()-2);
        System.out.println("The Secondd Largest Element is:"+secondlargestelement);
		

	}

}
