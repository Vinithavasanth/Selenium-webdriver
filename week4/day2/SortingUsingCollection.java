package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a String Array
		
		String[] Array={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> Listvalues = new ArrayList<>(Arrays.asList(Array));
		Collections.sort(Listvalues);
		System.out.println("List after sorting is:"+Listvalues);

		Collections.reverse(Listvalues);
		System.out.println("List aafter reversing is:"+Listvalues);
		
		

	}

}
