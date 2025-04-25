package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		Integer[] Array= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> List1 = new ArrayList<>(Arrays.asList(Array));
		Collections.sort(List1);
		for(int i=0;i<List1.size()-1;i++) {
			if( List1.get(i)+1!=List1.get(i+1)) {
				System.out.println(List1.get(i)+1+ " is the missing element");
			break;
			}
		}

	}}
