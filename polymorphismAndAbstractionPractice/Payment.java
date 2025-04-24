package polymorphismAndAbstractionPractice;

public abstract class Payment {
	public void paymentDetails() {
		System.out.println("Processing Payment...");
	}
    public abstract void processPayment(double amount);
}
  
