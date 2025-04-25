package week4.day1;

public class SBI implements RBI{

	public void mandatoryKYC() {
		System.out.println("PAN card is mandatory");
	}
	
	public void deposit() {
		System.out.println("10 Lakhs");
		}
	
	public static void main(String[] args) {
		SBI sbiOptions =new SBI();
		sbiOptions.mandatoryKYC();
		sbiOptions.deposit();
		
	}
}
