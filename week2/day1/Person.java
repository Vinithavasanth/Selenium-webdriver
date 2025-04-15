package week2.day1;

import java.util.Scanner;

public class Person {
	public String Name(String personName) {
		System.out.println("Person Name is entered successfully");
		return personName;
		
	}
	public void Age(int age) {
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Enter number");
		int nextInt = data.nextInt();
		
		Person details=new Person();
		details.Name("Vinitha");
		details.Age(nextInt);
		

	}

}
