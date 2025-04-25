package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> learners=new ArrayList<String>();
		System.out.println("The list is: "+learners);
		
		//add method
		learners.add("Rajesh");
		System.out.println("List after 1 data is: "+learners);
		
		learners.add("Bharat");
		System.out.println("List after adding 2nd data is: "+learners);
		
		//add 3rd,4th data
		learners.add("Venkatesh");
		learners.add("Selvi");
		System.out.println("The current list is: "+learners);
		
		//Adding by index
		learners.add(1, "Vinoth");
		System.out.println("The list after by index is: "+learners);
	
	    //Add duplicate value
		learners.add("Bharat");
		System.out.println("List after adding duplicate "+learners);
		
		//Removing an element - remove
		learners.remove(5);
		System.out.println("List after removing is: "+learners);
		//   0       1       2        3         4  
		//[Rajesh, Vinoth, Bharat, Venkatesh, Selvi]
		
		//Retrieving an element - get
		String dataAtIndex3 = learners.get(3);
		System.out.println(dataAtIndex3);
		
		//to get the number of elements
		int sizeOfList = learners.size();
		System.out.println("List size is: "+sizeOfList);
		
		//Sort the list in Ascii order
		Collections.sort(learners);
		System.out.println("List after sorting is: "+learners);
		
		//addAll - add all the data from one List to another List
		
		List<String> employees=new ArrayList<String>();
		System.out.println("Employees list is: "+employees);
		
		employees.addAll(learners);
		System.out.println("Current employees ist is: "+employees);
		
		
		//Clear all the data - clear
		learners.clear();
		System.out.println("List after clearing: "+learners);
	}

	}


