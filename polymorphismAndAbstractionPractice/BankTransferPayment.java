package polymorphismAndAbstractionPractice;

public class BankTransferPayment extends Payment {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid $" + amount + "using BankTransferPayment");
		
	}
	

}
