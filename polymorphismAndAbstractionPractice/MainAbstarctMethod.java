package polymorphismAndAbstractionPractice;

public class MainAbstarctMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment credit = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment bank = new BankTransferPayment();
        
        credit.paymentDetails();
        credit.processPayment(1000);
        paypal.paymentDetails();
        paypal.processPayment(100);
        bank.paymentDetails();
        bank.processPayment(200);
        
        


	}

}
