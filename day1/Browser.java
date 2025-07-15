package week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {
		
		System.out.println("Browser Launched Sucessfully");
		
		return browserName;
	}
	
	public void loadUrl() {
		
		System.out.println("Application Url Loaded Sucessfully");
	}
	
	public static void main(String[] args) {
		
		Browser bro1 = new Browser();
		String a = bro1.launchBrowser("Chrome");
		System.out.println(a);
		bro1.loadUrl();		
		
	}
}

