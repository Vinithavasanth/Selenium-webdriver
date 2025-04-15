package week2.day1;

public class Employee {
	public String employeeName(String Name) {
		System.out.println("Employee Name is Vinitha");
		return Name;
	}
	public void employeeID(int ID) {
		System.out.println("Employee ID : 100");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee details=new Employee();
		details.employeeName(null);
		details.employeeID(100+5);

	}

}
