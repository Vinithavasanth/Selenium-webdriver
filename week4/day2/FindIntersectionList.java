package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an Array
		Integer[] Array1={3, 2, 11, 4, 6, 7};
		Integer[] Array2={1, 2, 8, 4, 9, 7};
		
		//Creating empty List
		List<Integer> Arraylist1 = new ArrayList<>(Arrays.asList(Array1));
		List<Integer> Arraylist2 = new ArrayList<>(Arrays.asList(Array2));
		System.out.println(Arraylist1);
		System.out.println(Arraylist2);
		int Array1size = Arraylist1.size();
		int Array2size = Arraylist2.size();
		for (int i = 0; i < Array1size; i++) {
			for (int j = 0; j < Array2size; j++) {
				if(Array1[i]==Array2[j]) {
					System.out.println(Array1[i]);
				}
				
			}
			
		}
		
		
		
		

	}

}
