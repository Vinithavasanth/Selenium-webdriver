package week7.day2;

public class LearnConstructor {
	
	 int empID;
	 String empName;
	
    //Default Constructor
	public LearnConstructor() {
		System.out.println("I am default constructor");
	}
	
	//parameterize constructor
	public LearnConstructor(int empID, String empName) {
		System.out.println("I am a Parameterize constructorr");
		this.empID=empID;
		this.empName=empName;
	}

	public static void main(String[] args) {
		LearnConstructor lc= new LearnConstructor();
		LearnConstructor lc1= new LearnConstructor(7, "Vinitha");
		System.out.println(lc1.empID);
		System.out.println(lc1.empName);
	
		

	}

}
