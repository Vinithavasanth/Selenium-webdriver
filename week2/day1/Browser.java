package week2.day1;

public class Browser {
	
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched successfully"+" "+browserName);
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserOptions=new Browser();
		String launchBrowser = browserOptions.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		browserOptions.loadUrl();
		
	}

}
