package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define two input strings.
		String text1="stops";
		String text2="potss";
		//Check if the lengths of the two strings are equal
		if (text1.length()!= text2.length()) 
		{
			System.out.println("Length Mismatched");
			return;
		}
		//Convert both the strings to character arrays
		char[] charArray1 = text1.toCharArray();
		char[] charArray2= text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(Arrays.toString(charArray1));
		System.out.println(Arrays.toString(charArray2));
		//Check the sorted arrays
		  if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram.");
			
		  }
		 else {
			System.out.println("The given strings are not an Anagram.");
		}
		
		

	}

}
