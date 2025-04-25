package week4.day1;

public class CalculateFunctionality {
		
		public void addNumbers(int a,int b) {
			System.out.println(a+b);
			}
		
		public void addNumbers(int a, int b, int c) {
			System.out.println(a+b+c);
		}
		
		public void addNumbers(float a,float b) {
			System.out.println(a+b);
		}
		
		public void addNumbers(float a,int b) {
			System.out.println(a+b);
		}
		
		public static void main(String[] args) {
			//ClassName objName=new ClassName();
			CalculateFunctionality calcOptions=new CalculateFunctionality();
			calcOptions.addNumbers(3, 4);
			calcOptions.addNumbers(4.5f, 8.5f);
			calcOptions.addNumbers(2.5f, 1);
			calcOptions.addNumbers(2, 3, 5);
		}
	}


