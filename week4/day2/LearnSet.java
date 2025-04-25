package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet
		// Set<String> mentors=new HashSet<String>();
		// System.out.println("The set is: "+mentors);

		// TreeSet
		// Set<String> mentors=new TreeSet<String>();

		// LinkedHashSet
		Set<String> mentors = new LinkedHashSet<String>();
		mentors.add("Bhuvanesh");
		mentors.add("Vinoth");
		mentors.add("Muthu");
		mentors.add("Mukesh");
		System.out.println("The set is: "+mentors);
		
		//add
		mentors.add("muthu");
		System.out.println("Set after adding duplicate: "+mentors);
		
		//Remove
		mentors.remove("Muthu");
		System.out.println("Set after revoming: "+mentors);
		
		//size
		int sizeOfSet = mentors.size();
		System.out.println("Sizde of the current Set is:" +sizeOfSet);
		
		//addAll
		Set<String>trainers=new HashSet<String>();
		System.out.println("The Trainer set is:"+trainers);
		trainers.addAll(mentors);
		System.out.println("The new Trainer set is: "+trainers);
		
		//to Retrieve data
		//cannot use index so need to change Set to List
		//empty list
		List<String> allTrainers = new ArrayList<String>(trainers);
		System.out.println("The Trainers List is :"+allTrainers);
		
		//to retrieve element
		String elemInd1 = allTrainers.get(1);
		System.out.println("Index 1 value is:"+elemInd1);
		
		//To declare a Integer Set
        Set<Integer> numbers=new HashSet<Integer>();
        System.out.println("Numbers are:"+numbers);
        
        //To declare the Character Set
        Set<Character> logo=new HashSet<Character>();
        System.out.println("The Logo is:"+logo);
		
		
		
		

	}

}
