package week4.day1;

public class Amazon extends CanaraBank {
	
	public void cashOnDelivery() {
		System.out.println("Cash On Devlivery Enabled");
	}
	public void upiPayments() {
		System.out.println("UPI payment method Enabled");
	}
	public void cardPayments(){
		System.out.println("Card payment method Enabled");
	}
	public void internetBanking(){
		System.out.println("Internet Banking payment method Enabled");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon Options = new Amazon ();
		Options.recordPaymentDetails();
		Options.cashOnDelivery();
		Options.upiPayments();
		Options.cardPayments();
		Options.internetBanking();
		

	}

}
