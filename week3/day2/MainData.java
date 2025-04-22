package week3.day2;

public class MainData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData td= new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		System.out.println();
		
		LoginTestData ltd = new LoginTestData();
		ltd.EnterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		System.out.println();

	}

}
