package inheritancePractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vechicle Main method
		Car car = new Car();
		car.startEngine();
		car.playMusic();
		car.openSunroof();
		car.stopEngine();
		System.out.println("-----------");
		
		//Student
		Student st = new Student();
		st.setRollNumber();
		st.setName();
		st.displayInfo();
		st.displayStudentDetails();
		System.out.println("-----------");
		
		//Bank Account
		SavingsAccount sa= new SavingsAccount();
		sa.deposit(1000);
		sa.withdraw(300);
		sa.calculateInterest();
		sa.displayBalance();

	}

}
