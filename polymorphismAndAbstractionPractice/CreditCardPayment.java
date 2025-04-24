package polymorphismAndAbstractionPractice;

public class CreditCardPayment extends Payment{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid $" + amount + "using CreditCardPayment");
	}
	

}
